package gui;

import javax.swing.*;

import ClassProject.MusicManager;
import listener.RepertoireDeleterListener;
import listener.ReturnListener;

public class RepertoireDeleter extends JPanel {
	
	MusicManager musicManager;
	WindowFrame frame;
	
	public RepertoireDeleter(WindowFrame frame, MusicManager musicManager) {
		this.frame = frame;
		this.musicManager = musicManager;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelDelete = new JLabel("Which index do you want to delete?: ", JLabel.TRAILING);
		JTextField fieldDelete = new JTextField(10);
		labelDelete.setLabelFor(fieldDelete);
		panel.add(labelDelete);
		panel.add(fieldDelete);
		
		JButton deleteButton = new JButton("delete");
		deleteButton.addActionListener(new RepertoireDeleterListener(fieldDelete, frame, musicManager));
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new ReturnListener(frame));
		panel.add(deleteButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 2, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.add(panel);
		this.setVisible(true);
	}

	public MusicManager getMusicManager() {
		return musicManager;
	}

	public void setMusicManager(MusicManager musicManager) {
		this.musicManager = musicManager;
	}
}
