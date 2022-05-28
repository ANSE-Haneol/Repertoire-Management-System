package gui;

import javax.swing.*;
import javax.swing.table.*;

public class RepertoireViewer extends JFrame {
	
	public RepertoireViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Composer");
		model.addColumn("Title");
		model.addColumn("Genre");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		this.setVisible(true);
	}
}
