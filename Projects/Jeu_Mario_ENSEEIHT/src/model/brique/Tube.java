/**
 * 
 */
package model.brique;

import java.awt.image.BufferedImage;

/**Cette classes represente tout les tubes presents dans la map du jeu.
 * @author EL BOUZEKRAOUI YOUNES
 * @version 1
 */
public class Tube extends Brique{
	
    public Tube(double x, double y, BufferedImage style){
        super(x, y, style);
        SetBreakable(false);
        setVide(true);
        setDimension(96,96);
    }

}
