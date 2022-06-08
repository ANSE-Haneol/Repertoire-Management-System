package gui;

import javax.swing.*;

import ClassProject.MusicManager;
import listener.RepertoireEditListener;
import listener.ReturnListener;

public class RepertoireEditor extends JPanel {
		
	WindowFrame frame;
	MusicManager musicManager;
	
	public RepertoireEditor(WindowFrame frame, MusicManager musicManager) {
		this.frame = frame;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelIdx = new JLabel("Index that you want to edit: ", JLabel.TRAILING);
		JTextField fieldIdx = new JTextField(10);
		labelIdx.setLabelFor(labelIdx);
		panel.add(labelIdx);
		panel.add(fieldIdx);
		
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
		
		JButton editButton = new JButton("edit");
		editButton.addActionListener(new RepertoireEditListener(fieldIdx, fieldComposer, fieldTitle, fieldGenre, musicManager, frame));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new ReturnListener(frame));
		panel.add(editButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.add(panel);
		this.setVisible(true);
	}
}
