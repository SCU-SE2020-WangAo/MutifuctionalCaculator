package BuilderPattern;

import GUI.BasePanel;

public  abstract class Builder 
{	
	public abstract void addShowPanel(); 
	public abstract void addButtonPanel(); 
	public abstract void Create(); 
	public abstract BasePanel getPanle();
}
