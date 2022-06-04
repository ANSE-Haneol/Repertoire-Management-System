package listener;

import java.awt.event.*;
import javax.swing.*;

import gui.WindowFrame;
import gui.RepertoireAdder;
import gui.RepertoireViewer;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}


	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		RepertoireAdder adder = frame.getRepertoireadder();
		frame.setupPanel(adder);
	}
}