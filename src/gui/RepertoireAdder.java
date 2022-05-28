package gui;
	
import javax.swing.*;

public class RepertoireAdder extends JFrame {
	
	public RepertoireAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelComposer = new JLabel("Composer: ", JLabel.TRAILING);
		JTextField fieldComposer = new JTextField(10);
		labelComposer.setLabelFor(fieldComposer);
		panel.add(labelComposer);
		panel.add(fieldComposer);
		
		JLabel labelTitle = new JLabel("Title: ", JLabel.TRAILING);
		JTextField fieldTitle = new JTextField(10);
		labelTitle.setLabelFor(fieldTitle);
		panel.add(labelTitle);
		panel.add(fieldTitle);
		
		JLabel labelGenre = new JLabel("Genre: ", JLabel.TRAILING);
		JTextField fieldGenre = new JTextField(10);
		labelGenre.setLabelFor(fieldGenre);
		panel.add(labelGenre);
		panel.add(fieldGenre);
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setContentPane(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
