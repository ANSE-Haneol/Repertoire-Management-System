package listener;

import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.*;

import ClassProject.MusicManager;
import classesAndInterfaces.ClassicalRepertoire;
import classesAndInterfaces.Music;
import gui.WindowFrame;

public class ClassicalAdderListener implements ActionListener {

	JTextField fieldComposer;
	JTextField fieldTitle;
	JTextField fieldGenre;
	WindowFrame frame;
	MusicManager musicManager;
	
	public ClassicalAdderListener(JTextField fieldComposer, JTextField fieldTitle, 
			JTextField fieldGenre, MusicManager musicManager, WindowFrame frame) {
		this.fieldComposer = fieldComposer;
		this.fieldTitle = fieldTitle;
		this.fieldGenre = fieldGenre;
		this.frame = frame;
		this.musicManager = musicManager;
	}

	public void actionPerformed(ActionEvent e) {	
		Music m = new ClassicalRepertoire();
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