package GUI;

import java.awt.Font;
import javax.swing.*;


public class ProgrammerShowPanel extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	
	
	private JTextField binary_area=new JTextField("0000,0000,0000,0000,0000,0000,0000,0000");
	
	private JTextField result_area=new JTextField("0",26);
	private JLabel label1=new JLabel("二进制");
	private JLabel label2=new JLabel("表达式");
	private Font font=new Font("Dialog",1,15);
	
	public ProgrammerShowPanel()
	{
		
		binary_area.setFont(font);
		result_area.setFont(font);
		label1.setFont(font);
		label2.setFont(font);
		
		
		binary_area.setHorizontalAlignment(JTextField.RIGHT);
		binary_area.setEditable(false);
		result_area.setHorizontalAlignment(JTextField.RIGHT);
		result_area.setEditable(false);
		
		
		setLayout(null);
		binary_area.setBounds(120, 10, 450 ,30);
		result_area.setBounds(120, 50,450, 30);
		label1.setBounds(20, 10, 100, 30);
		label2.setBounds(20, 50, 100, 30);
		add(binary_area);
		add(result_area);
		add(label1);
		add(label2);	
	}
	

	public JTextField getBinary_area() 
	{
		return binary_area;
	}

	public void setBinary_area(JTextField binary_area) {
		this.binary_area = binary_area;
	}


	public JTextField getResult_area() {
		return result_area;
	}

	public void setResult_area(JTextField result_area) {
		this.result_area = result_area;
	}


}
