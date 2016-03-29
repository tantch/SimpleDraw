package framework;

public abstract class Plugin {
	
	protected String name;
	
	public Plugin(){
		
	}
	public Plugin(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}
}
