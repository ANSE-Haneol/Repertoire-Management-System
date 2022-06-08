package listener;

import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.*;

import ClassProject.MusicManager;
import classesAndInterfaces.BaroqueRepertoire;
import classesAndInterfaces.Music;
import gui.WindowFrame;

public class RepertoireEditListener implements ActionListener {
	
	JTextField fieldIdx;
	JTextField fieldComposer;
	JTextField fieldTitle;
	JTextField fieldGenre;
	WindowFrame frame;
	MusicManager musicManager;
	
	public RepertoireEditListener(JTextField fieldIdx, JTextField fieldComposer, JTextField fieldTitle, 
			JTextField fieldGenre, MusicManager musicManager, WindowFrame frame) {
		this.fieldIdx = fieldIdx;
		this.fieldComposer = fieldComposer;
		this.fieldTitle = fieldTitle;
		this.fieldGenre = fieldGenre;
		this.frame = frame;
		this.musicManager = musicManager;
	}

	public void actionPerformed(ActionEvent e) {
		int delIdx = Integer.parseInt(fieldIdx.getText());
		Music m = musicManager.getMusic(delIdx);
		m.setComposer(fieldComposer.getText());
		m.setTitle(fieldTitle.getText());
		m.setGenre(fieldGenre.getText());
		musicManager.addMusic(m);
		
		putObject(musicManager, "MusicManager.ser");
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuSelection());
		frame.revalidate();
		frame.repaint();
	}
	
	public static void putObject(MusicManager musicManager, String filename)
	{
		FileOutputStream file;
		try {
			file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(musicManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
	}
}