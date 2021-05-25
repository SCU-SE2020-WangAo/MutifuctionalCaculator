package CommandPattern;

import GUI.FeatureButtonPanel;
import GUI.FeatureShowPanel;

public class CommandSolve implements Command
{
	
	private  FeatureShowPanel feature_show_panel;
	
	public CommandSolve(FeatureShowPanel feature_show_panel)
	{
		
		this.feature_show_panel=feature_show_panel;
	}
	
	@Override
	public void Execute(FeatureButtonPanel feature_button_panel) 
	{
		
		String a=feature_button_panel.getText_3_a().getText();
		String b=feature_button_panel.getText_3_b().getText();
		String c=feature_button_panel.getText_3_c().getText();
		
		feature_show_panel.processSolve(a,b,c);
	}

}
