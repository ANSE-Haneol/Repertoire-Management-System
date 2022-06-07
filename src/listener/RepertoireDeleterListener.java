package listener;

import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.*;

import ClassProject.MusicManager;
import gui.WindowFrame;

public class RepertoireDeleterListener implements ActionListener{
	
	JTextField fieldDelete;
	WindowFrame frame;
	MusicManager musicManager;
	
	
	public RepertoireDeleterListener(JTextField fieldDelete, WindowFrame frame, MusicManager musicManager) {
		this.fieldDelete = fieldDelete;
		this.frame = frame;
		this.musicManager = musicManager;
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			int delIdx = Integer.parseInt(fieldDelete.getText());
			musicManager.getList().remove(delIdx);
		} catch(IndexOutOfBoundsException e1) {

		} finally {
			putObject(musicManager, "MusicManager.ser");
			
			frame.getContentPane().removeAll();
			frame.getContentPane().add(frame.getMenuSelection());
			frame.revalidate();
			frame.repaint();
		}
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
