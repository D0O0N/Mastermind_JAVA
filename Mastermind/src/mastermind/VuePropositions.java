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
	public VuePropositions(ItemListener l,Modele m) {
		this.setBackground(Color.GRAY);
		this.setSize(400,700);
		this.coul.add(Color.gray) ;
		this.coul.add(Color.gray) ;
		this.coul.add(Color.gray) ;
		this.coul.add(Color.gray) ;
		m.addObserver(this);
	}
	
	public void paint(Graphics g) {
		int r = 40;
		for (int i = 0; i < 4 ; i++) {
			g.setColor(coul.get(i));
			g.fillOval((r + 10)*i + 20, 10, r, r);
		}
		
	}
	@Override
	public void update(Observable o, Object arg) {
		Color[] listJetons = ((Rangee)arg).jetons;
		int i = 0;
		while (i < listJetons.length && listJetons[i] != null) {
			this.coul.set(i,((Rangee)arg).jetons[i]) ;
			i += 1;
		}

		repaint();
	}
}
