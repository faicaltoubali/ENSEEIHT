package ordo;

import config.*;
import map.*;
import formats.*;
import hdfs.NameNode.*;
import hdfs.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class Job implements JobInterfaceX {

    public int NumberOfReducers;
    public int NumberOfMaps = 0;
    public Format.Type InputFormat;
    public Format.Type InterFormat;
    public Format.Type OutputFormat;
    public String InputFileName;
    public String InterFileName;
    public String OutputFileName;
    public SortComparator Sortcomparator;

    
    public void startJob(MapReduce mr) {
        //Obtention du nombre de maps
        NumberOfMaps = getMapNumber();

        // Recuperer la liste des workers auprès du registre.
        ArrayList<Worker> workers = new ArrayList<Worker>();

        for (int i = 0; i < Project.workershosts.length; i++) {
            try {
                Worker worker = (Worker) Naming.lookup("//" + Project.workershosts[i] + ":" + Project.workersports[i] + "/Worker");
                if(worker != null)
                    workers.add(worker);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Initialisation du rappel callback
        CallBack callback = null;
        try {
            callback = new CallBackImpl();
        } catch (Exception c) {
            c.printStackTrace();
        }
        /*
         * // Préparation des formats // Format Inputworkers, Outputworkers, Tmpworkers;
         * // try { // if (InputFormat == Format.Type.LINE) { // Inputworkers = new
         * LineFormat(InputFileName); // } else if (InputFormat == Format.Type.KV) { //
         * Inputworkers = new KVFormat(InputFileName); // } // } catch (Exception e) {
         * // e.printStackTrace(); // } // Tmpworkers = new KVFormat(InterFileName); //
         * Outputworkers = new KVFormat(OutputFileName);
         */
        // Lancement des workers
        for (int i = 0; i < this.NumberOfMaps; i++) {
            // le worker qui effectuera le runmap sur le chunk i
            int workerId = i%Project.workershosts.length;
            Worker worker = workers.get(workerId);
            Format Tmpinputworker = null;
            try {
                if (InputFormat == Format.Type.LINE) {
                    Tmpinputworker = new LineFormat(HdfsServer.PATH + "tmp/" + InputFileName + "-chunk" + i);
                } else if (InputFormat == Format.Type.KV) {
                    Tmpinputworker = new KVFormat(HdfsServer.PATH + "tmp/" + InputFileName + "-chunk" + i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            Format Tmpinterworker = new KVFormat(HdfsServer.PATH + "tmp/" + InputFileName + "-res" + i);
            try {
                worker.runMap(mr, Tmpinputworker, Tmpinterworker, callback);
            } catch (RemoteException r) {
                r.printStackTrace();
            }

        }

        // Attendre que tous les maps aient finit leurs traitements
        try {
            callback.AttendreMaps(NumberOfMaps);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            HdfsClient.HdfsRead(InputFileName, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Format Outputread = new KVFormat(HdfsServer.PATH + "tmp/" + InputFileName + "-res");
        Format Outputreduce = new KVFormat(HdfsServer.PATH + "tmp/" + InputFileName + "-final");

        Outputread.open(Format.OpenMode.R);
        Outputreduce.open(Format.OpenMode.W);
        mr.reduce(Outputread, Outputreduce);

    }

    public int getMapNumber(){
        int nm = 0;
        try{
        NameNode namenode = (NameNode) Naming
                        .lookup(Project.nameNodeURL);

        nm = namenode.getNbrChunks(InputFileName);
        //System.out.println(nm);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return nm;

    }

    public void setNumberOfReduces(int tasks) {
        this.NumberOfReducers = tasks;
    }

    public void setNumberOfMaps(int tasks) {
        this.NumberOfMaps = tasks;
    }

    public void setInputFormat(Format.Type ft) {
        this.InputFormat = ft;
    }

    public void setInputFname(String fname) {
        this.InputFileName = fname;
    }

    public void setOutputFormat(Format.Type ft) {
        this.OutputFormat = ft;
    }

    public void setOutputFname(String fname) {
        this.OutputFileName = fname;
    }

    public void setSortComparator(SortComparator sc) {
        this.Sortcomparator = sc;
    }

    public int getNumberOfReduces() {
        return this.NumberOfReducers;
    }

    public int getNumberOfMaps() {
        return this.NumberOfMaps;
    }

    public Format.Type getInputFormat() {
        return this.InputFormat;
    }

    public Format.Type getOutputFormat() {
        return this.OutputFormat;
    }

    public String getInputFname() {
        return this.InputFileName;
    }

    public String getOutputFname() {
        return this.OutputFileName;
    }

    public SortComparator getSortComparator() {
        return this.Sortcomparator;
    }


}