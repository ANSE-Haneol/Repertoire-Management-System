package gui;

import javax.swing.*;

import ClassProject.MusicManager;

public class WindowFrame extends JFrame {
	MusicManager musicManager;
	MenuSelection menuSelection;
	EraSelector eraSelector;
	BaroqueAdder baroqueAdder;
	ClassicalAdder classicalAdder;
	RomanticAdder romanticAdder;
	RepertoireDeleter repertoireDeleter;
	RepertoireViewer repertoireViewer;
	
	public WindowFrame(MusicManager musicManager) {
		this.musicManager = musicManager;
		this.menuSelection = new MenuSelection(this);
		this.eraSelector = new EraSelector(this, this.musicManager);
		this.baroqueAdder = new BaroqueAdder(this, this.musicManager);
		this.classicalAdder = new ClassicalAdder(this, this.musicManager);
		this.romanticAdder = new RomanticAdder(this, this.musicManager);
		this.repertoireDeleter = new RepertoireDeleter(this, this.musicManager);
		this.repertoireViewer = new RepertoireViewer(this, this.musicManager);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuSelection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(MenuSelection menuSelection) {
		this.menuSelection = menuSelection;
	}
	
	public EraSelector getEraSelector() {
		return eraSelector;
	}

	public void setEraSelector(EraSelector eraSelector) {
		this.eraSelector = eraSelector;
	}
	
	public BaroqueAdder getBaroqueAdder() {
		return baroqueAdder;
	}

	public void setBaroqueAdder(BaroqueAdder baroqueAdder) {
		this.baroqueAdder = baroqueAdder;
	}
	
	public ClassicalAdder getClassicalAdder() {
		return classicalAdder;
	}

	public void setClassicalAdder(ClassicalAdder classicalAdder) {
		this.classicalAdder = classicalAdder;
	}
	
	public RomanticAdder getRomanticAdder() {
		return romanticAdder;
	}

	public void setRomanticAdder(RomanticAdder romanticAdder) {
		this.romanticAdder = romanticAdder;
	}

	public RepertoireViewer getRepertoireViewer() {
		return repertoireViewer;
	}

	public void setRepertoireViewer(RepertoireViewer repertoireViewer) {
		this.repertoireViewer = repertoireViewer;
	}
	
	public RepertoireDeleter getRepertoireDeleter() {
		return repertoireDeleter;
	}

	public void setRepertoireDeleter(RepertoireDeleter repertoireDeleter) {
		this.repertoireDeleter = repertoireDeleter;
	}
}
