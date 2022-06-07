package gui;

import javax.swing.*;

import listener.ButtonDeleteListener;
import listener.ButtonViewListener;
import listener.EraSelectionListener;
import listener.ExitListener;

import java.awt.*;

public class MenuSelection extends JPanel {
	
	WindowFrame frame;
	MenuSelection(WindowFrame frame) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Repertoire");
		JButton button2 = new JButton("Delete Repertoire");
		JButton button3 = new JButton("Edit Repertoire");
		JButton button4 = new JButton("View Repertoire");
		JButton button5 = new JButton("Exit");
		
		button1.addActionListener(new EraSelectionListener(frame));
		button2.addActionListener(new ButtonDeleteListener(frame));
//		button3.addActionListener(new ButtonEditListener(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		button5.addActionListener(new ExitListener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
	}
}
