package framework;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	JButton but;
	JPanel controls;
	JPanel addPlugin;
	JPanel topBar;
	JTextField plugin;
	private JPanel contentPane;
	DrawArea drawArea;
	ActionListener actionListener = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			
			
			try {
				
				Class pluginClass = Class.forName("plugins." + plugin.getText());
				Plugin plugin = (Plugin)pluginClass.newInstance();
				plugin.setFrame(drawArea);
				System.out.println(plugin.getName());
				JButton button = new JButton(plugin.getName());
				button.addActionListener(plugin.getActionLister());
				controls.add(button);
				
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 plugin.setText("Write plugin name here");

			
			 revalidate();
		};
	};

	public MyFrame() {
		super("SimpleDraw");

		initialize();

	}

	private void initialize() {
		contentPane = new JPanel();
		plugin = new JTextField();
		plugin.setSize(50, 20);
		this.setContentPane(contentPane); // Display the window.

		contentPane.setLayout(new BorderLayout());

		drawArea = new DrawArea();

		// add to content pane
		contentPane.add(drawArea, BorderLayout.CENTER);

		// create controls to apply colors and call clear feature
		controls = new JPanel();
		topBar = new JPanel();
		addPlugin = new JPanel();
		topBar.setLayout(new BorderLayout());
		
		but = new JButton("Load");
		but.addActionListener(actionListener);
		 plugin.setText("Write plugin name here");
		 plugin.setSize(200, 10);
			
		addPlugin.add(plugin);
		addPlugin.add(but);

		/*
		 * // add to panel controls.add(greenBtn); controls.add(blueBtn);
		 * controls.add(blackBtn); controls.add(redBtn);
		 * controls.add(magentaBtn); controls.add(clearBtn);
		 */

		// add to content pane
		topBar.add(addPlugin,BorderLayout.NORTH);
		topBar.add(controls, BorderLayout.CENTER);
		contentPane.add(topBar, BorderLayout.NORTH);

		this.setSize(600, 600);
		// can close frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// show the swing paint result
		this.setVisible(true);

	}


	public DrawArea getDrawArea() {
		// TODO Auto-generated method stub
		return drawArea;
	}

}
