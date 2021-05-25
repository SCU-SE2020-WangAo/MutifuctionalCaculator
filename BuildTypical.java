package BuilderPattern;

import GUI.*;

public class BuildTypical extends Builder
{
	private BasePanel typical_panel=new BasePanel();
	private CommonShowPanel show_panel;
	private TypicalButtonPanel button_panel;
	
	@Override
	public void addShowPanel() 
	{
		// TODO Auto-generated method stub
		show_panel=new CommonShowPanel();
		typical_panel.setShow_panel(show_panel);
		
	}

	@Override
	public void addButtonPanel() 
	{
		// TODO Auto-generated method stub
		button_panel=new TypicalButtonPanel();
		typical_panel.setButton_panel(button_panel);
		
	}
	
	@Override
	public void Create() 
	{
		// TODO Auto-generated method stub
		
		button_panel.controlShow(show_panel.getExperssion_area(), show_panel.getResult_area());
		button_panel.setActionListner();
		
		typical_panel.setLayout(null);
		typical_panel.setSize(600, 400);
		
		show_panel.setBounds(0,0,600,90);
		button_panel.setBounds(10,90,580,240);

		typical_panel.add(show_panel);
		typical_panel.add(button_panel);
		
	}
	
	@Override
	public BasePanel getPanle() 
	{
		// TODO Auto-generated method stub
		return typical_panel;
	}

	

}
