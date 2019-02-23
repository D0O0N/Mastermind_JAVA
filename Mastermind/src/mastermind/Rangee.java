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
	int taille = 4;
	public Rangee() {
		
		//this.modl=m;
		this.noirs=0;
		this.blancs=0;
		this.jetons = new Color[4];
		this.jetons[0] = Color.gray;
		this.jetons[1] = Color.gray;
		this.jetons[2] = Color.gray;
		this.jetons[3] = Color.gray;
		this.indiceJeton = 0;
	}
	public void addJeton(Color coul) {
		//this.jetons[this.indiceJeton] = this.modl.COULEURS[]
		
		if (this.indiceJeton < this.taille) {
			this.jetons[ this.indiceJeton ] = coul;
			this.indiceJeton += 1;
			this.etat = Etat.EN_COURS;
		}
		if (indiceJeton == this.taille) {
			//tentatives += 1;
			this.indiceJeton = 0; 
			this.etat = Etat.COMPLETE;
		}
		
	}
	
	public boolean equals(Rangee prop) {
		boolean bon = true;
		boolean tab[] = {false,false,false,false};
		for (int i = 0; i < jetons.length; i++) {
			
			if (! (this.jetons[i] == prop.jetons[i])) { bon = false;}
			
			// D'abord l'on vérifie tous les noirs, si ils sont dedans on les ajoutent à tab
			for (int j = 0; j < jetons.length; j++) {
				if (this.jetons[j] == prop.jetons[i]){
					if (i == j) {
						this.noirs += 1;
						tab[i] = true;
						
					}
				}
			}
			// On regarde si le jeton est présent dans la combinaison
			for (int j = 0; j < jetons.length; j++) {
				if (this.jetons[j] == prop.jetons[i]){
					// Si ce jeton n'a pas été compté comme un noir alors on ajoute en bla
					if(!tab[i])  {
							this.blancs += 1;
							break; // pas besoin de continuer si l'on croise un blanc
						}
				}
			}
		}
		for (int k = 0; k < 4; k++) {
			System.out.println(tab[k]);
		}

		return bon;
	}
	

}
