package gui;

import javax.swing.*;
import javax.swing.table.*;

import ClassProject.MusicManager;

import java.util.*;

import classesAndInterfaces.Music;

public class RepertoireViewer extends JPanel {
	
	WindowFrame frame;
	MusicManager musicmanager;
	
	public RepertoireViewer(WindowFrame frame, MusicManager musicmanager) {
		this.musicmanager = musicmanager;
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Composer");
		model.addColumn("Title");
		model.addColumn("Genre");
		
		for(int i = 0; i < musicmanager.getSize(); i++) {
			Vector row = new Vector();
			Music m = musicmanager.getMusic(i);
			row.add(m.getComposer());
			row.add(m.getTitle());
			row.add(m.getGenre());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
	}
}
