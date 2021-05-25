package BuilderPattern;

import CommandPattern.*;
import GUI.*;

public class BuildFeature extends Builder
{
	private BasePanel feature_panel=new BasePanel();
	private FeatureShowPanel show_panel;
	private FeatureButtonPanel button_panel;
	
	@Override
	public void addShowPanel() 
	{
		show_panel=new FeatureShowPanel();
		feature_panel.setShow_panel(show_panel);
	}

	@Override
	public void addButtonPanel() 
	{
		button_panel=new FeatureButtonPanel();
		feature_panel.setButton_panel(button_panel);
	}

	@Override
	public void Create() 
	{
		feature_panel.setLayout(null);
		feature_panel.setSize(600, 400);
		
		show_panel.setBounds(400,0,200,400);
		button_panel.setBounds(0,0,400,400);
		
		feature_panel.add(show_panel);
		feature_panel.add(button_panel);
		
		
		Command command0=new CommandFactorization(show_panel);
		Command command1=new Command2radical(show_panel);
		Command command2=new CommandSolve(show_panel);
		Command command3=new CommandGCDLCM(show_panel);
		Command command4=new CommandFraction(show_panel);
		
		Activation[] activations=new Activation[5];
		
		activations[0]=new Activation(command0,button_panel);
		activations[1]=new Activation(command1,button_panel);
		activations[2]=new Activation(command2,button_panel);
		activations[3]=new Activation(command3,button_panel);
		activations[4]=new Activation(command4,button_panel);
		
		button_panel.setActivation(activations);
		button_panel.addActionLinsener();
		
	}

	@Override
	public BasePanel getPanle() 
	{
		return feature_panel;
	}
}
