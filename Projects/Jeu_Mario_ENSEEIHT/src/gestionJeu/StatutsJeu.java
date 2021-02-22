package gestionJeu;

/** Listing des différents status possibles du jeu.
 * Selon le status du jeu, le moteur du jeu agira différemment.
 * @author Alexis Carn
 */

public enum StatutsJeu {
	GAME_OVER,
	EN_PAUSE,
	EN_JEU,
	ECRAN_START,
	SELECTION_NIVEAU,
	ECRAN_AIDE,
	NIVEAU_TERMINE,
	ECRAN_A_PROPOS	
}
