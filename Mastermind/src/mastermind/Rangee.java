package mastermind;

import java.awt.Color;

import mastermind.Modele.Etat;

public class Rangee {
	
	public Color[] jetons;
	public int indiceJeton;
	public Modele modl;
	public int noirs,blancs ;
	public enum Etat{
		VIDE, EN_COURS,COMPLETE
	}
	public Rangee(Modele m) {
		Etat etat=Etat.VIDE;
		this.modl=m;
		this.noirs=0;
		this.blancs=0;
		this.jetons = new Color[m.DIFFICULTE];
		System.out.println("longueeeur");
		System.out.println(jetons.length);
		this.indiceJeton=0;
	}
	public void remplir() {
		//this.jetons[this.indiceJeton] = this.modl.COULEURS[]
	}
}
