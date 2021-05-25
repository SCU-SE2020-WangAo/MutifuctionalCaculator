package GUI;

import javax.swing.JPanel;

public class BasePanel extends JPanel 
{
	
	private JPanel show_panel;
	private JPanel button_panel;
	 
	public void setShow_panel(JPanel show_panel) 
	{
		this.show_panel = show_panel;
	}
	
	public void setButton_panel(JPanel button_panel) 
	{
		this.button_panel = button_panel;
	}
	
}
