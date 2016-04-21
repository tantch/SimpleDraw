package framework;

import java.awt.event.ActionListener;

public abstract class Plugin {
	
	protected DrawArea drawArea;
	protected String name;
	protected ActionListener action;
	public Plugin(){
		
	}
	public Plugin(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}
	
	public ActionListener getActionLister(){
		return action;
	}
	
	public void setFrame(DrawArea drawArea){
		this.drawArea = drawArea;
	}
	
}
