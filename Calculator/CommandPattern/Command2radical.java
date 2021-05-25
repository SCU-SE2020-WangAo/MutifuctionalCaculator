package CommandPattern;

import GUI.*;

public class Command2radical implements Command  
{
	
	private  FeatureShowPanel feature_show_panel;

	public Command2radical(FeatureShowPanel feature_show_panel)
	{
		
		this.feature_show_panel=feature_show_panel;
	}
	
	@Override
	public void Execute(FeatureButtonPanel feature_button_panel) 
	{
		
		feature_show_panel.process2radical(feature_button_panel.getText_2().getText());
	}

}
