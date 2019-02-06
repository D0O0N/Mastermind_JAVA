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
		this.setSize(400,700);/*
		this.coul.add(Color.red) ;
		this.coul.add(Color.red) ;
		this.coul.add(Color.red) ;
		this.coul.add(Color.red) ;*/
		m.addObserver(this);
		
		this.propositions=new Rangee[10];	
		// On initialise toutes les propositions en tant que nouvelles rangee
		for (int i = 0; i < propositions.length; i++) {
			propositions[i] = new Rangee();
		}
	}
	
	public void paint(Graphics g) {
		int r = 40;
		for (int i = 0; i < propositions.length; i++) {
			for (int j = 0; j < propositions[0].taille; j++) {
				g.setColor(propositions[i].jetons[j]);
				g.fillOval(20+(j * (r+15)), 20+(i * (r + 20)) , r, r);
			}
			
		}
		
		
		
	}
	@Override
	public void update(Observable o, Object arg) {
		this.propositions = (Rangee[])arg;
		repaint();
	}
}
