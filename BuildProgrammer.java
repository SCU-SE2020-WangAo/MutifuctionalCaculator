package BuilderPattern;

import GUI.*;

public class BuildProgrammer extends Builder 
{
	private BasePanel feature_panel=new BasePanel();
	private ProgrammerShowPanel show_panel;
	private ProgrammerButtonPanel button_panel;
	
	@Override
	public void addShowPanel() 
	{
		// TODO Auto-generated method stub
		show_panel=new ProgrammerShowPanel();
		feature_panel.setShow_panel(show_panel);
	}

	@Override
	public void addButtonPanel() 
	{
		// TODO Auto-generated method stub
		button_panel=new ProgrammerButtonPanel();
		feature_panel.setButton_panel(button_panel);
	}

	@Override
	public void Create() 
	{
		// TODO Auto-generated method stub
		
		button_panel.controlShow(show_panel.getBinary_area(), show_panel.getResult_area());
		button_panel.setActionListner();
		
		feature_panel.setLayout(null);
		feature_panel.setSize(600, 400);
		
		show_panel.setBounds(0,0,600,90);
		button_panel.setBounds(10,95,580,240);

		feature_panel.add(show_panel);
		feature_panel.add(button_panel);
	}

	@Override
	public BasePanel getPanle() 
	{
		// TODO Auto-generated method stub
		return feature_panel;
	}

}
