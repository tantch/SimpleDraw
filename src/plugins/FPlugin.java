package plugins;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import framework.DrawArea;
import framework.Plugin;

public class FPlugin extends Plugin {

	public FPlugin() {
		this.name = "Fantastic Plugin";
		action = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("just amaziiing");
				 Graphics2D g2 = drawArea.getG2();
				g2.setPaint(Color.white);
			    // draw white on entire draw area to clear
			    g2.fillRect(0, 0, drawArea.getSize().width, drawArea.getSize().height);
			    g2.setPaint(Color.black);
			    drawArea.repaint();
			};
		};
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	

}
