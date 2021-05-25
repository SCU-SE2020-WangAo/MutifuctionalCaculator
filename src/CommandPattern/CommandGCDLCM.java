package CommandPattern;

import GUI.*;

public class CommandGCDLCM implements Command	
{
	
	private  FeatureShowPanel feature_show_panel;
	
	public CommandGCDLCM(FeatureShowPanel feature_show_panel)
	{
		
		this.feature_show_panel=feature_show_panel;
	}
	
	@Override
	public void Execute(FeatureButtonPanel feature_button_panel) 
	{
		
		String m=feature_button_panel.getText_4_m().getText();
		String n=feature_button_panel.getText_4_n().getText();
		feature_show_panel.processGCDLCM(m, n);
	}

}
