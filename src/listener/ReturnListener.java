package listener;

import java.awt.event.*;

import gui.WindowFrame;

public class ReturnListener implements ActionListener {
	
	WindowFrame frame;
	
	public ReturnListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuSelection());
		frame.revalidate();
		frame.repaint();
	}
}