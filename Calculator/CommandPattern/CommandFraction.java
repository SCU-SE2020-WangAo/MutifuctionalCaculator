package CommandPattern;

import GUI.FeatureButtonPanel;
import GUI.FeatureShowPanel;

public class CommandFraction implements Command
{
	
	private  FeatureShowPanel feature_show_panel;
	
	public CommandFraction(FeatureShowPanel feature_show_panel)
	{
		
		this.feature_show_panel=feature_show_panel;
	}
	
	@Override
	public void Execute(FeatureButtonPanel feature_button_panel) 
	{
		
		feature_show_panel.processFraction(feature_button_panel.getText_5().getText());
	}

}
