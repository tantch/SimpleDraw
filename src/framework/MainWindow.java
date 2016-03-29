package framework;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class MainWindow {

	static MyFrame frame;
	
	private static void createAndShowGUI() {
		// Create and set up the window.
		frame = new MyFrame();
		
//					try {
//						
//						Class pluginClass = Class.forName("plugins.FPlugin");
//						Plugin plugin = (Plugin)pluginClass.newInstance();
//						System.out.println(plugin.getName());
//					} catch (ClassNotFoundException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					} catch (InstantiationException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					} catch (IllegalAccessException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
				
		
		
		
	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}
	
	
	
}