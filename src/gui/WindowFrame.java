package gui;

import javax.swing.*;

import ClassProject.MusicManager;

public class WindowFrame extends JFrame {
	MusicManager musicmanager;
	MenuSelection menuselection;
	RepertoireAdder repertoireadder;
	RepertoireViewer repertoireviewer;
	
	public WindowFrame(MusicManager musicmanager) {
		this.musicmanager = musicmanager;
		this.menuselection = new MenuSelection(this);
		this.repertoireadder = new RepertoireAdder(this);
		this.repertoireviewer = new RepertoireViewer(this, this.musicmanager);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public RepertoireAdder getRepertoireadder() {
		return repertoireadder;
	}

	public void setRepertoireadder(RepertoireAdder repertoireadder) {
		this.repertoireadder = repertoireadder;
	}

	public RepertoireViewer getRepertoireviewer() {
		return repertoireviewer;
	}

	public void setRepertoireviewer(RepertoireViewer repertoireviewer) {
		this.repertoireviewer = repertoireviewer;
	}

}
