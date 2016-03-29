package framework;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	public MyFrame() throws HeadlessException {
		super("SimpleDraw");
		contentPane = new JPanel();
		
		
		initialize();
		
		
		
	}

	private void initialize() {
		this.setContentPane(contentPane); // Display the window.
		this.pack();
		this.setVisible(true);
		
	}

	
	

}
