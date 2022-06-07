package gui;

import javax.swing.*;

import ClassProject.MusicManager;
import listener.ReturnListener;
import listener.EraListener;

public class EraSelector extends JPanel {
	
	JButton button1, button2, button3;
	MusicManager musicManager;
	WindowFrame frame;
	
	public EraSelector(WindowFrame frame, MusicManager musicManager) {
		this.musicManager = musicManager;
		this.frame = frame;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel label = new JLabel("Select the era of repertoire.");
		button1 = new JButton("Baroque");
		button1.addActionListener(new EraListener(frame));
		button2 = new JButton("Classical");
		button2.addActionListener(new EraListener(frame));
		button3 = new JButton("Romantic");
		button3.addActionListener(new EraListener(frame));
		JButton button4 = new JButton("Cancel");
		button4.addActionListener(new ReturnListener(frame));
		
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		SpringUtilities.makeCompactGrid(panel, 5, 1, 6, 6, 6, 6);
		this.setSize(300, 300);
		this.add(panel);
		this.setVisible(true);
	}
	
	public JButton getButton1() {
		return button1;
	}

	public void setButton1(JButton button1) {
		this.button1 = button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public void setButton2(JButton button2) {
		this.button2 = button2;
	}

	public JButton getButton3() {
		return button3;
	}

	public void setButton3(JButton button3) {
		this.button3 = button3;
	}
}
