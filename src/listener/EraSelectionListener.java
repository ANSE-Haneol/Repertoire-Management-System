package listener;

import java.awt.event.*;

import gui.WindowFrame;

public class EraSelectionListener implements ActionListener {
	
	WindowFrame frame;
	
	public EraSelectionListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getEraSelector());
		frame.revalidate();
		frame.repaint();
	}
}