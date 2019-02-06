package mastermind;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.Observable;
import java.util.Observer;

public class VueClavier extends Panel implements Observer{
	
	Button[] boutons = new Button[8];
	
	public VueClavier(ActionListener al,Modele m) {
		
		this.setLayout(new FlowLayout());
		
		for (int i=0;i<m.COULEURS.length;i++) {
			this.boutons[i] = new Button();
			this.boutons[i].setPreferredSize(new Dimension(30,30));
			this.boutons[i].setBackground(m.COULEURS[i]);
			this.boutons[i].addActionListener(al);
			this.setBackground(Color.WHITE);
			this.add(this.boutons[i]);
			m.addObserver(this);
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}
