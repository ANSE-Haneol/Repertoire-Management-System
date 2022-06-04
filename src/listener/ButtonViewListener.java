package listener;

import java.awt.event.*;
import javax.swing.*;

import gui.WindowFrame;
import gui.RepertoireViewer;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}


	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		RepertoireViewer viewer = frame.getRepertoireviewer();
		frame.setupPanel(viewer);
	}
}
