/**
 * 
 */
package model.brique;

import java.awt.image.BufferedImage;

/**
 * @author EL BOUZEKRAOUI YOUNES
 * @version
 */
public class BriqueSol extends Brique {

    public BriqueSol(double x, double y, BufferedImage style){
        super(x, y, style);
        SetBreakable(false);
        setVide(true);
    }
}
