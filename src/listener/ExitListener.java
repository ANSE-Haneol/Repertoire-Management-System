package listener;

import java.awt.event.*;

import gui.WindowFrame;

public class ExitListener implements ActionListener {
	
	WindowFrame frame;
	
	public ExitListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}