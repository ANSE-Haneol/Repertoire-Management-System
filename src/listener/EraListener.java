package listener;

import java.awt.event.*;
import javax.swing.*;

import gui.WindowFrame;
import gui.EraSelector;

public class EraListener implements ActionListener {

	WindowFrame frame;
	
	public EraListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		EraSelector eraSelector = frame.getEraSelector();
		JButton button1 = eraSelector.getButton1();
		JButton button2 = eraSelector.getButton2();
		JButton button3 = eraSelector.getButton3();
		
		if(e.getSource() == button1) {
			frame.getContentPane().add(frame.getBaroqueAdder());
		}
		else if(e.getSource() == button2) {
			frame.getContentPane().add(frame.getClassicalAdder());
		}
		else if(e.getSource() == button3) {
			frame.getContentPane().add(frame.getRomanticAdder());
		}
		frame.revalidate();
		frame.repaint();
	}
}