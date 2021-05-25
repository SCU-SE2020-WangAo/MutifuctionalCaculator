package GUI;

import java.awt.*;
import javax.swing.*;

public class CommonShowPanel  extends JPanel
{
    
	private static final long serialVersionUID = 1L;
		
	
	private JTextField experssion_area=new JTextField("0");  
	
	private JTextField result_area=new JTextField("",26);
	
	private JLabel label1=new JLabel("表达式");
	private JLabel label2=new JLabel("结果");
	private Font font=new Font("Dialog",1,15); 
	
	public CommonShowPanel()
	{
		
		experssion_area.setFont(font);
		result_area.setFont(font);
		label1.setFont(font);
		label2.setFont(font);
		
		
		experssion_area.setHorizontalAlignment(JTextField.RIGHT);
		experssion_area.setEditable(false);
	
		
		result_area.setHorizontalAlignment(JTextField.RIGHT);
		result_area.setEditable(false);
		
		
		setLayout(null);
		experssion_area.setBounds(120, 10, 450 ,30);
		result_area.setBounds(120, 50,450, 30);
		label1.setBounds(20, 10, 100, 30);
		label2.setBounds(20, 50, 100, 30);
		add(experssion_area);
		add(result_area);
		add(label1);
		add(label2);	
	}
	
	public void setResult_area(JTextField result_area) 
	{
		this.result_area = result_area;
	}
	
	public JTextField getExperssion_area() 
	{
		return experssion_area;
	}

	public void setExperssion_area(JTextField experssion_area) 
	{
		this.experssion_area = experssion_area;
	}


	public JTextField getResult_area() 
	{
		return result_area;
	}


}
