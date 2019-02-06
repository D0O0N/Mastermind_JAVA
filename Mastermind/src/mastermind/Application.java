package mastermind;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Application extends Frame implements WindowListener{

	public Application() {
		this.setLayout(new BorderLayout());
		Modele m = new Modele();
		Controleur c = new Controleur(m);
		VuePropositions Prop1= new VuePropositions(c,m);
		VueClavier Clav1= new VueClavier(c,m);
		
		this.add(Prop1, BorderLayout.CENTER);
		this.add(Clav1, BorderLayout.PAGE_END);
		
		this.addWindowListener(this);
		this.setTitle("Mastermind");
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Application();
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0); 
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
