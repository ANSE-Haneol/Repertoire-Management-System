package listener;

import java.awt.event.*;

import ClassProject.MusicManager;
import gui.WindowFrame;

public class ButtonEditListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonEditListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getRepertoireEditor());
		frame.revalidate();
		frame.repaint();
	}
}