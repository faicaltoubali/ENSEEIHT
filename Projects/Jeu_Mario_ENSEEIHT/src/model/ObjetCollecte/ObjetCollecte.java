
package model.ObjetCollecte;

import java.awt.*;

import gestionJeu.MoteurJeu;
import model.Player.Mario;

/**Interface modelisant les les operations necessaires sur les objets collect�s
 * et qui  serait impl�ment� par les differents objets collect�s Mushroom, Star ,Flower
 * @author EL BOUZEKRAOUI YOUNES
 *
 */
public interface ObjetCollecte {
	
	Rectangle getBounds();
	
	int getPoint();

    void reveal();

    

    void onTouch(Mario mario, MoteurJeu engine);

}
