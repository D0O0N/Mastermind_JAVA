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
		this.combinaison=new Rangee(this);
		this.propositions=new Rangee[this.N_TENTATIVES];	
		System.out.println("Longueur prop");
		System.out.println(propositions[0]);
	}
	
	public void selection(Color coul) {
		this.setChanged();
		
		int i = 0;
		//System.out.println(combinaison.jetons[i]);
		while (i < combinaison.jetons.length && combinaison.jetons[i] != null) {
			i += 1;
		}
		combinaison.jetons[i] = coul;
		//System.out.println(i);
		
		this.notifyObservers(this.combinaison);
	}
}
