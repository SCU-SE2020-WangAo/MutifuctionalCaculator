package BuilderPattern;

import GUI.*;

public class BuildScience extends Builder
{
	private BasePanel science_panel=new BasePanel();
	private CommonShowPanel show_panel;
	private ScienceButtionPanel button_panel;
	
	@Override
	public void addShowPanel() 
	{
		// TODO Auto-generated method stub
		show_panel=new CommonShowPanel();
		science_panel.setShow_panel(show_panel);
	}

	@Override
	public void addButtonPanel() 
	{
		// TODO Auto-generated method stub
		button_panel=new ScienceButtionPanel();
		science_panel.setButton_panel(button_panel);
	}

	@Override
	public void Create() 
	{
		// TODO Auto-generated method stub
		
		button_panel.controlShow(show_panel.getExperssion_area(), show_panel.getResult_area());
		button_panel.setActionListner();
		
		science_panel.setLayout(null);
		science_panel.setSize(600, 400);
		
		show_panel.setBounds(0,0,600,90);
		button_panel.setBounds(10,90,580,240);
		
		science_panel.add(show_panel);
		science_panel.add(button_panel);
	}

	@Override
	public BasePanel getPanle() 
	{
		// TODO Auto-generated method stub
		return science_panel;
	}

}
