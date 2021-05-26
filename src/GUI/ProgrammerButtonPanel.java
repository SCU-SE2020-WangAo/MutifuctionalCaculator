package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Tool.*;

public class ProgrammerButtonPanel extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	
	private MyButton button_1=new MyButton("1");
	private MyButton button_2=new MyButton("2");
	private MyButton button_3=new MyButton("3");
	private MyButton button_4=new MyButton("4");
	private MyButton button_5=new MyButton("5");
	private MyButton button_6=new MyButton("6");
	private MyButton button_7=new MyButton("7");
	private MyButton button_8=new MyButton("8");
	private MyButton button_9=new MyButton("9");
	private MyButton button_0=new MyButton("0");
	private MyButton button_dot=new MyButton(".");
	private MyButton button_equal=new MyButton("=");
	private MyButton button_reciprocal=new MyButton("1/x");
	private MyButton button_div=new MyButton("/");
	private MyButton button_add=new MyButton("+");
	private MyButton button_mul=new MyButton("*");
	private MyButton button_sub=new MyButton("-");
	private MyButton button_squareroot=new MyButton("√");
	private MyButton button_back=new MyButton("←");
	private MyButton button_clear=new MyButton("C");
	
	private MyButton button_A=new MyButton("A");
	private MyButton button_B=new MyButton("B");
	private MyButton button_C=new MyButton("C");
	private MyButton button_D=new MyButton("D");
	private MyButton button_E=new MyButton("E");
	private MyButton button_F=new MyButton("F");
	private MyButton button_and=new MyButton("AND");
	private MyButton button_or=new MyButton("OR");
	private MyButton button_xor=new MyButton("XOR");
	private MyButton button_not=new MyButton("NOT");
	private MyButton button_mod=new MyButton("MOD");
	
	private CheckboxGroup cbg=new CheckboxGroup();
	private Checkbox scale_16=new Checkbox("16 hex",cbg,false);
	private Checkbox scale_10=new Checkbox("10 hex",cbg,true);
	private Checkbox scale_8=new Checkbox("8 hex",cbg,false);
	private Checkbox scale_2=new Checkbox("2 hex",cbg,false);
	private MyButton button_chose=new MyButton("Chose");

	private JTextField binary_area;
	private JTextField result_area;

	
	private int scale=10;  
	
	private int op=0;
	
	private CalcForProgrammer cal=new CalcForProgrammer();
	
	
	private boolean finished=false;
	
	private boolean zero_start=true;
	
	public ProgrammerButtonPanel()
	{
		
		setLayout(new GridLayout(5, 7, 7, 7));
		add(button_chose);
		add(button_and);
		add(button_A);
		add(button_back);
		add(button_clear);
		add(button_squareroot);
		add(button_div);
		add(scale_16);
		add(button_or);
		add(button_B);
		add(button_7);
		add(button_8);
		add(button_9);
		add(button_mul);
		add(scale_10);
		add(button_xor);
		add(button_C);
		add(button_4);
		add(button_5);
		add(button_6);
		add(button_sub);
		add(scale_8);
		add(button_not);
		add(button_D);
		add(button_1);
		add(button_2);
		add(button_3);
		add(button_add);
		add(scale_2);
		add(button_mod);
		add(button_E);
		add(button_F);
		add(button_0);
		add(button_dot);
		add(button_equal);
		
		
		button_A.setEnabled(false);
		button_B.setEnabled(false);
		button_C.setEnabled(false);
		button_D.setEnabled(false);
		button_E.setEnabled(false);
		button_F.setEnabled(false);
		
		
		button_squareroot.setEnabled(false);
		button_dot.setEnabled(false);	
	}
	
	public void controlShow(JTextField binary_area,JTextField result_area)
	{
		
		this.binary_area=binary_area;
		this.result_area=result_area;	
	}
	
	public void setActionListner()
	{
		
		button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{		
					if(zero_start)
					{
						zero_start=false;
						result_area.setText("1");				
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0001");		
					}
					else
					{
						result_area.setText(result_area.getText()+"1");			
						binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
					}
				}		
				else
				{
					op=0;
					finished=false;
					zero_start=false;
					
					result_area.setText("1");				
					binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0001");	
				}		
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{		
					if(zero_start)
					{
						zero_start=false;
						result_area.setText("2");				
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0010");		
					}
					else
					{
						result_area.setText(result_area.getText()+"2");			
						binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
					}
				}		
				else
				{
					op=0;
					finished=false;
					zero_start=false;
					
					result_area.setText("2");				
					binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0010");	
				}		
			}
		});
		
		button_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{		
					if(zero_start)
					{
						zero_start=false;
						result_area.setText("3");				
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0011");		
					}
					else
					{
						result_area.setText(result_area.getText()+"3");			
						binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
					}
				}		
				else
				{
					op=0;
					finished=false;
					zero_start=false;
					
					result_area.setText("3");				
					binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0011");	
				}		
			}
		});
		
		button_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{		
					if(zero_start)
					{
						zero_start=false;
						result_area.setText("4");				
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0100");		
					}
					else
					{
						result_area.setText(result_area.getText()+"4");			
						binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
					}
				}		
				else
				{
					op=0;
					finished=false;
					zero_start=false;
					
					result_area.setText("4");				
					binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0100");	
				}		
			}
		});
		
		button_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{		
					if(zero_start)
					{
						zero_start=false;
						result_area.setText("5");				
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0101");		
					}
					else
					{
						result_area.setText(result_area.getText()+"5");			
						binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
					}
				}		
				else
				{
					op=0;
					finished=false;
					zero_start=false;
					
					result_area.setText("5");				
					binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0101");	
				}		
			}
		});
		
		button_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{		
					if(zero_start)
					{
						zero_start=false;
						result_area.setText("6");				
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0110");		
					}
					else
					{
						result_area.setText(result_area.getText()+"6");			
						binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
					}
				}		
				else
				{
					op=0;
					finished=false;
					zero_start=false;
					
					result_area.setText("6");				
					binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0110");	
				}		
			}
		});
		
		button_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{		
					if(zero_start)
					{
						zero_start=false;
						result_area.setText("7");				
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0111");		
					}
					else
					{
						result_area.setText(result_area.getText()+"7");			
						binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
					}
				}		
				else
				{
					op=0;
					finished=false;
					zero_start=false;
					
					result_area.setText("7");				
					binary_area.setText("0000,0000,0000,0000,0000,0000,0000,0111");	
				}		
			}
		});
		
		button_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{		
					if(zero_start)
					{
						zero_start=false;
						result_area.setText("8");				
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1000");		
					}
					else
					{
						result_area.setText(result_area.getText()+"8");			
						binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
					}
				}		
				else
				{
					op=0;
					finished=false;
					zero_start=false;
					
					result_area.setText("8");				
					binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1000");	
				}		
			}
		});
		
		button_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{		
					if(zero_start)
					{
						zero_start=false;
						result_area.setText("9");				
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1001");		
					}
					else
					{
						result_area.setText(result_area.getText()+"9");			
						binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
					}
				}		
				else
				{
					op=0;
					finished=false;
					zero_start=false;
					
					result_area.setText("9");				
					binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1001");	
				}		
			}
		});
		
		button_0.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				
				if(!finished)
				{
					if(zero_start)
					{
						result_area.setText("0");	
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1001");
					}
					else
					{
						result_area.setText(result_area.getText()+"0");	
						binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
					}
				}		
				else
				{
					op=0;
					finished=false;
					zero_start=false;
	
					result_area.setText("0");	
					binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1001");
				}		
		
			}
		});
		
		button_A.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				if(scale==16)
				{
					if(!finished)
					{
						if(zero_start)
						{
							zero_start=false;
							result_area.setText("A");	
							binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1010");
						}
						else
						{
							result_area.setText(result_area.getText()+"A");	
							binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
						}
					}		
					else
					{
						op=0;
						finished=false;
						zero_start=false;
						
						result_area.setText("A");	
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1010");
					}		
				}
	
			}
		});
		
		button_B.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				if(scale==16)
				{
					if(!finished)
					{
						if(zero_start)
						{
							zero_start=false;
							result_area.setText("B");	
							binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1011");
						}
						else
						{
							result_area.setText(result_area.getText()+"B");	
							binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
						}
					}		
					else
					{
						op=0;
						finished=false;
						zero_start=false;
						
						result_area.setText("B");	
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1011");
					}		
				}
	
			}
		});
		
		button_C.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				if(scale==16)
				{
					if(!finished)
					{
						if(zero_start)
						{
							zero_start=false;
							result_area.setText("C");	
							binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1100");
						}
						else
						{
							result_area.setText(result_area.getText()+"C");	
							binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
						}
					}		
					else
					{
						op=0;
						finished=false;
						zero_start=false;
						
						result_area.setText("C");	
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1100");
					}		
				}
	
			}
		});
		
		button_D.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				if(scale==16)
				{
					if(!finished)
					{
						if(zero_start)
						{
							zero_start=false;
							result_area.setText("D");	
							binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1101");
						}
						else
						{
							result_area.setText(result_area.getText()+"D");	
							binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
						}
					}		
					else
					{
						op=0;
						finished=false;
						zero_start=false;
						
						result_area.setText("D");	
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1101");
					}		
				}
	
			}
		});
		
		button_E.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				if(scale==16)
				{
					if(!finished)
					{
						if(zero_start)
						{
							zero_start=false;
							result_area.setText("E");	
							binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1110");
						}
						else
						{
							result_area.setText(result_area.getText()+"E");	
							binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
						}
					}		
					else
					{
						op=0;
						finished=false;
						zero_start=false;
						
						result_area.setText("E");	
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1110");
					}		
				}
	
			}
		});
		
		button_F.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				if(scale==16)
				{
					if(!finished)
					{
						if(zero_start)
						{
							zero_start=false;
							result_area.setText("F");	
							binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1111");
						}
						else
						{
							result_area.setText(result_area.getText()+"F");	
							binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
						}
					}		
					else
					{
						op=0;
						finished=false;
						zero_start=false;
						
						result_area.setText("F");	
						binary_area.setText("0000,0000,0000,0000,0000,0000,0000,1111");
					}		
				}
	
			}
		});
		
		
		button_add.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{
					if(op>0)
					{
						//�������㣬����result_area���
						cal.setNext_num(result_area.getText(),scale);	
						result_area.setText(cal.compute(op,scale));
						cal.setPrev_num(result_area.getText(),scale);		
					}
					else
					{
						cal.setPrev_num(result_area.getText(),scale);
					}		
					op=1;
					zero_start=true;
				}
			}
		});
		
		button_sub.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{
					if(op>0)
					{
						//�������㣬����result_area���
						cal.setNext_num(result_area.getText(),scale);	
						result_area.setText(cal.compute(op,scale));
						cal.setPrev_num(result_area.getText(),scale);		
					}
					else
					{
						cal.setPrev_num(result_area.getText(),scale);
					}		
					op=2;
					zero_start=true;
				}
			}
		});

		button_mul.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{
					if(op>0)
					{
						//�������㣬����result_area���
						cal.setNext_num(result_area.getText(),scale);	
						result_area.setText(cal.compute(op,scale));
						cal.setPrev_num(result_area.getText(),scale);		
					}
					else
					{
						cal.setPrev_num(result_area.getText(),scale);
					}		
					op=3;
					zero_start=true;
				}
			}
		});

		button_div.addActionListener(new ActionListener() 
		{
	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{
					if(op>0)
					{
						//�������㣬����result_area���
						cal.setNext_num(result_area.getText(),scale);	
						result_area.setText(cal.compute(op,scale));
						cal.setPrev_num(result_area.getText(),scale);		
					}
					else
					{
						cal.setPrev_num(result_area.getText(),scale);
					}		
					op=4;
					zero_start=true;
				}
			}
		});
		
		button_and.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(!finished)
				{
					if(op>0)
					{
						//�������㣬����result_area���
						cal.setNext_num(result_area.getText(),scale);	
						result_area.setText(cal.compute(op,scale));
						cal.setPrev_num(result_area.getText(),scale);		
					}
					else
					{
						cal.setPrev_num(result_area.getText(),scale);
					}		
					op=5;
					zero_start=true;
				}
			}
		});
		
		button_or.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(!finished)
				{
					if(op>0)
					{
						//�������㣬����result_area���
						cal.setNext_num(result_area.getText(),scale);	
						result_area.setText(cal.compute(op,scale));
						cal.setPrev_num(result_area.getText(),scale);		
					}
					else
					{
						cal.setPrev_num(result_area.getText(),scale);
					}		
					op=6;
					zero_start=true;
				}
			}
		});
		
	
		button_xor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(!finished)
				{
					if(op>0)
					{
						//�������㣬����result_area���
						cal.setNext_num(result_area.getText(),scale);	
						result_area.setText(cal.compute(op,scale));
						cal.setPrev_num(result_area.getText(),scale);		
					}
					else
					{
						cal.setPrev_num(result_area.getText(),scale);
					}		
					op=7;
					zero_start=true;
				}
			}
		});

		button_not.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{
					if(op>0)
					{
						//�������㣬����result_area���	
						result_area.setText(CalcForProgrammer.processNot(op, scale));
						cal.setNext_num(result_area.getText(),scale);		
					}
					else
					{
						cal.setPrev_num(result_area.getText(),scale);
						result_area.setText(CalcForProgrammer.processNot(op, scale));
					}	
					
					zero_start=true;
				}
			}
		});
		
		button_mod.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(!finished)
				{
					if(op>0)
					{
						//�������㣬����result_area���
						cal.setNext_num(result_area.getText(),scale);	
						result_area.setText(cal.compute(op,scale));
						cal.setPrev_num(result_area.getText(),scale);		
					}
					else
					{
						cal.setPrev_num(result_area.getText(),scale);
					}		
					op=9;
					zero_start=true;
				}
	
			}
		});
		
		
		button_equal.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub		
				if(!finished)
				{
					if(op>0)
					{
						//�������㣬����result_area���
						cal.setNext_num(result_area.getText(),scale);	
						result_area.setText(cal.compute(op,scale));		
						binary_area.setText(cal.binaryData(cal.ToScale2(cal.ToScale10(result_area.getText(), scale))));
					}
					//op=0;
					finished=true;
					zero_start=true;	
				}	
			}
		});
		
		button_clear.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				op=0;
				finished=false;
				zero_start=true;
				result_area.setText("0");	
			}
		});
		
		button_back.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				if(result_area.getText().charAt(result_area.getText().length()-1)>='0'&&
				result_area.getText().charAt(result_area.getText().length()-1)<='9'	
				)
					result_area.setText(
							result_area.getText().substring(0,result_area.getText().length()-1));
				
				if(result_area.getText().length()==0)
				{
					result_area.setText("0");
					zero_start=true;
				}
			}
		});
		
		
		
		button_chose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(cbg.getCurrent()==scale_16)
				{	
				
					button_1.setEnabled(true);
					button_2.setEnabled(true);
					button_3.setEnabled(true);
					button_4.setEnabled(true);
					button_5.setEnabled(true);
					button_6.setEnabled(true);
					button_7.setEnabled(true);
					button_8.setEnabled(true);
					button_9.setEnabled(true);
					button_0.setEnabled(true);
					
					button_A.setEnabled(true);
					button_B.setEnabled(true);
					button_C.setEnabled(true);
					button_D.setEnabled(true);
					button_E.setEnabled(true);
					button_F.setEnabled(true);
					
					result_area.setText(cal.ToScale16(cal.ToScale10(result_area.getText(),scale)));
					
					scale=16;
				}
				
				if(cbg.getCurrent()==scale_10)
				{
				
					button_0.setEnabled(true);
					button_1.setEnabled(true);
					button_2.setEnabled(true);
					button_3.setEnabled(true);
					button_4.setEnabled(true);
					button_5.setEnabled(true);
					button_6.setEnabled(true);
					button_7.setEnabled(true);
					button_8.setEnabled(true);
					button_9.setEnabled(true);
					
					button_A.setEnabled(false);
					button_B.setEnabled(false);
					button_C.setEnabled(false);
					button_D.setEnabled(false);
					button_E.setEnabled(false);
					button_F.setEnabled(false);
					
					
					result_area.setText(cal.ToScale10(result_area.getText(),scale));
				
					scale=10;
				}
				
				if(cbg.getCurrent()==scale_8)
				{
					
					button_0.setEnabled(true);
					button_1.setEnabled(true);
					button_2.setEnabled(true);
					button_3.setEnabled(true);
					button_4.setEnabled(true);
					button_5.setEnabled(true);
					button_6.setEnabled(true);
					button_7.setEnabled(true);
					button_8.setEnabled(false);
					button_9.setEnabled(false);
					
					button_A.setEnabled(false);
					button_B.setEnabled(false);
					button_C.setEnabled(false);
					button_D.setEnabled(false);
					button_E.setEnabled(false);
					button_F.setEnabled(false);
					
					result_area.setText(cal.ToScale8(cal.ToScale10(result_area.getText(),scale)));
			
					scale=8;
				}
				
				if(cbg.getCurrent()==scale_2)
				{
					button_0.setEnabled(true);
					button_1.setEnabled(true);
					button_2.setEnabled(false);
					button_3.setEnabled(false);
					button_4.setEnabled(false);
					button_5.setEnabled(false);
					button_6.setEnabled(false);
					button_7.setEnabled(false);
					button_8.setEnabled(false);
					button_9.setEnabled(false);	
					button_A.setEnabled(false);
					button_B.setEnabled(false);
					button_C.setEnabled(false);
					button_D.setEnabled(false);
					button_E.setEnabled(false);
					button_F.setEnabled(false);		
					result_area.setText(cal.ToScale2(cal.ToScale10(result_area.getText(),scale)));
					
					scale=2;
				}	
				
			}
		});
		
		
		
		
	}
}
