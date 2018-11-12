import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import controller.ExitAppController;
import model.Model;
import view.KlotskiApp;

public class Main {
	public static void main (String args[]) {
		Model m = new Model();
		//KlotskiApp app = new KlotskiApp(m); 
		//do i need this if I have 
		//almost the same later? explore "final"
		
		
		
		final KlotskiApp app = new KlotskiApp(m);
		app.addWindowListener (new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				new ExitAppController(app).process();
			}

		});
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
}
