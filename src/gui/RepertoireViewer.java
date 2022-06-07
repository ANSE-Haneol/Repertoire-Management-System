package gui;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

import ClassProject.MusicManager;

import java.util.*;

import classesAndInterfaces.Music;
import listener.ReturnListener;

public class RepertoireViewer extends JPanel {
	
	WindowFrame frame;
	MusicManager musicManager;

	public RepertoireViewer(WindowFrame frame, MusicManager musicManager) {
		this.musicManager = musicManager;
		this.frame = frame;
	}
	
	public RepertoireViewer refresh()
	{	
		JPanel panel = new JPanel();
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Composer");
		model.addColumn("Title");
		model.addColumn("Genre");
		
		musicManager.sortList();
		for(int i = 0; i < musicManager.getSize(); i++) {
			Vector row = new Vector();
			Music m = musicManager.getMusic(i);
			row.add(m.getComposer());
			row.add(m.getTitle());
			row.add(m.getGenre());
			model.addRow(row);
		}
	
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		JButton returnButton = new JButton("back");
		returnButton.addActionListener(new ReturnListener(frame));
		panel.add(returnButton);
		this.add(panel, BorderLayout.NORTH);
		
		this.add(sp);
		this.setSize(300, 300);
		
		return this;
	}
	
	public MusicManager getMusicManager() {
		return musicManager;
	}

	public void setMusicManager(MusicManager musicManager) {
		this.musicManager = musicManager;
	}
}
