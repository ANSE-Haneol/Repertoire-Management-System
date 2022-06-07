package listener;

import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import ClassProject.MusicManager;
import gui.WindowFrame;
import gui.RepertoireDeleter;

public class ButtonDeleteListener implements ActionListener {
	
	WindowFrame frame;
	
	public ButtonDeleteListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		MusicManager mm = getObject("MusicManager.ser");
		RepertoireDeleter repertoireDeleter = frame.getRepertoireDeleter();
		repertoireDeleter.setMusicManager(mm);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getRepertoireDeleter());
		frame.revalidate();
		frame.repaint();
	}
	
	public static MusicManager getObject(String filename) 
	{	
		MusicManager musicManager = null;
		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			musicManager = (MusicManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return musicManager;
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {

		}
		
		return musicManager;
	}
}