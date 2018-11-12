package controller;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 * Controller to confirm request to exist application.
 */

public class ExitAppController {

	JFrame app;

	public ExitAppController(JFrame app) {
		this.app = app;
	}

	public void process() {
		int c = JOptionPane.showConfirmDialog (app, "Do you wish to exit this Application?");

		if (c == JOptionPane.OK_OPTION) {
			app.setVisible(false);
			app.dispose();
		}
	}
}
