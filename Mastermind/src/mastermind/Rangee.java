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
	Etat etat=Etat.VIDE;
	public Rangee() {
		
		//this.modl=m;
		this.noirs=0;
		this.blancs=0;
		this.jetons = new Color[4];
		this.jetons[0] = Color.gray;
		this.jetons[1] = Color.gray;
		this.jetons[2] = Color.gray;
		this.jetons[3] = Color.gray;
		System.out.println("longueeeur");
		System.out.println(jetons.length);
		this.indiceJeton=0;
	}
	public void remplir() {
		//this.jetons[this.indiceJeton] = this.modl.COULEURS[]
	}
}
