package mastermind;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Observable;

public class Modele extends Observable {
	
	Color[] COULEURS = {Color.yellow, Color.green, Color.blue, Color.magenta,Color.red,Color.orange,Color.white,Color.black};
	int N_TENTATIVES = 10 ;
	int DIFFICULTE = 4 ;
	enum Etat{
		EN_COURS,GAGNE,PERDU
	}
	Etat etat = Etat.EN_COURS;
	Rangee combinaison;
	Rangee[] propositions;
	int tentatives=0;
	
	public Modele() {
		this.combinaison=new Rangee();
		this.combinaison.jetons[0] = Color.black;
		this.combinaison.jetons[1] = Color.black;
		this.combinaison.jetons[2] = Color.green;
		this.combinaison.jetons[3] = Color.blue;

		this.propositions=new Rangee[this.N_TENTATIVES];	
		// On initialise toutes les propositions en tant que nouvelles rangee
		for (int i = 0; i < propositions.length; i++) {
			propositions[i] = new Rangee();
		}
	}
	
	public void selection(Color coul) {
			
		
		propositions[tentatives].addJeton(coul);
		
		if (propositions[tentatives].etat == Rangee.Etat.COMPLETE) {
			if (propositions[tentatives].equals(combinaison)) {
				System.out.println("t treau faurt");
			}
			else {
				System.out.println("raté");
			}
			tentatives += 1;

		}
		
		
			

		
		this.setChanged();
		this.notifyObservers(this.propositions);
	}
	
}
