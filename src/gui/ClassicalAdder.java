package gui;
	
import javax.swing.*;

import ClassProject.MusicManager;
import listener.ReturnListener;
import listener.ClassicalAdderListener;

public class ClassicalAdder extends JPanel {
	
	MusicManager musicManager;
	WindowFrame frame;
	
	public ClassicalAdder(WindowFrame frame, MusicManager musicManager) {
		this.frame = frame;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelComposer = new JLabel("Composer: ", JLabel.TRAILING);
		JTextField fieldComposer = new JTextField(10);
		labelComposer.setLabelFor(fieldComposer);
		panel.add(labelComposer);
		panel.add(fieldComposer);
		
		JLabel labelTitle = new JLabel("Title: ", JLabel.TRAILING);
		JTextField fieldTitle = new JTextField(10);
		labelTitle.setLabelFor(fieldTitle);
		panel.add(labelTitle);
		panel.add(fieldTitle);
		
		JLabel labelGenre = new JLabel("Genre: ", JLabel.TRAILING);
		JTextField fieldGenre = new JTextField(10);
		labelGenre.setLabelFor(fieldGenre);
		panel.add(labelGenre);
		panel.add(fieldGenre);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new ClassicalAdderListener(fieldComposer, fieldTitle, fieldGenre, musicManager, frame));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new ReturnListener(frame));
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.add(panel);
		this.setVisible(true);
	}
}
