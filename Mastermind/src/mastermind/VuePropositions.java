package mastermind;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

public class VuePropositions extends Canvas implements Observer{

	public ArrayList<Color> coul= new ArrayList<Color>() ;
	public int place;
	public Rangee[] propositions;
	
	public VuePropositions(ItemListener l,Modele m) {
		this.setBackground(Color.GRAY);
		this.setSize(400,800);

		m.addObserver(this);
		
		this.propositions=new Rangee[10];	
		// On initialise toutes les propositions en tant que nouvelles rangee
		for (int i = 0; i < propositions.length; i++) {
			propositions[i] = new Rangee();
		}
	}
	
	public void paint(Graphics g) {
		int r = 50;
		int pr = 14;
		for (int i = 0; i < propositions.length; i++) {
			for (int j = 0; j < propositions[0].taille; j++) {
				g.setColor(propositions[i].jetons[j]);
				g.fillOval(r/2+(j * (r+15)), r/2+(i * (r + 20)) , r, r);
			}
			for (int j = 0; j < propositions[i].noirs + propositions[i].blancs; j++) {
				if (j < propositions[i].noirs) {
					g.setColor(Color.black);
				}
				else {
					g.setColor(Color.white);
				}
				//g.setColor(propositions[i].jetons[j]);
				g.fillOval(r * 6 +(j%2 * (pr+15)), r/2 + 5+(i * (r + 20)) + (j/2)*(r/2) , pr, pr);
			}

			
		}
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.propositions = (Rangee[])arg;
		repaint();
	}
}
