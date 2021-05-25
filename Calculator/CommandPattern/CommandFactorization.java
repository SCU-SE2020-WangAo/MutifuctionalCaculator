package CommandPattern;

import GUI.*;

public class CommandFactorization implements Command 
{
	
	private  FeatureShowPanel feature_show_panel;
	
	public CommandFactorization(FeatureShowPanel feature_show_panel)
	{
		
		this.feature_show_panel=feature_show_panel;
	}

	@Override
	public void Execute(FeatureButtonPanel feature_button_panel) 
	{
		
		feature_show_panel.processFactorization(feature_button_panel.getText_1().getText());
	}
	
	 
	
}
