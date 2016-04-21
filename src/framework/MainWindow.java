package framework;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class MainWindow {

	static MyFrame frame;
	
	private static void createAndShowGUI() {
		// Create and set up the window.
		frame = new MyFrame();
		
				
		
		
		
	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}
	
	
	
}