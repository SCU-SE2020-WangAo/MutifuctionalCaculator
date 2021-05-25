package CommandPattern;

import java.awt.event.*;
import GUI.FeatureButtonPanel;

public class Activation implements ActionListener
{
	private Command command;
	private FeatureButtonPanel feature_button_panel;
	
	public Activation(Command command,FeatureButtonPanel feature_button_panel)
	{
		
		this.command=command;
		this.feature_button_panel=feature_button_panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		command.Execute(feature_button_panel);
	}

}
