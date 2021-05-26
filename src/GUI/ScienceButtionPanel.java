package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import Tool.*;

public class ScienceButtionPanel extends JPanel
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
	
	private MyButton button_square=new MyButton("x^2");
	private MyButton button_cube=new MyButton("x^3");
	private MyButton button_sin=new MyButton("sin(x)");
	private MyButton button_cos=new MyButton("cos(x)");
	private MyButton button_tan=new MyButton("tan(x)");
	
	private MyButton button_leftbracket=new MyButton("(");
	private MyButton button_rightbracket=new MyButton(")");
	private MyButton button_arcsin=new MyButton("arcsin(x)");
	private MyButton button_arccos=new MyButton("arccos(x)");
	private MyButton button_arctan=new MyButton("arctan(x)");
	
	private MyButton button_pi=new MyButton("π");
	private MyButton button_e=new MyButton("e");
	private MyButton button_exp=new MyButton("exp(x)");
	private MyButton button_ln=new MyButton("ln(x)");
	private MyButton button_log=new MyButton("log(x)");
		
	
	private JTextField experssion_area;
	private JTextField result_area;
	
	private boolean finished=false;


	public ScienceButtionPanel()
	{
		setLayout(new GridLayout(5, 7, 7, 7));
		
		add(button_pi);
		add(button_leftbracket);
		add(button_square);
		add(button_back);
		add(button_clear);
		add(button_squareroot);
		add(button_div);
		
		add(button_e);
		add(button_rightbracket);
		add(button_cube);
		add(button_7);
		add(button_8);
		add(button_9);
		add(button_mul);
		
		add(button_exp);
		add(button_arcsin);
		add(button_sin);
		add(button_4);
		add(button_5);
		add(button_6);
		add(button_sub);
		
		add(button_ln);
		add(button_arccos);
		add(button_cos);
		add(button_1);
		add(button_2);
		add(button_3);
		add(button_add);
		
		add(button_log);
		add(button_arctan);
		add(button_tan);
		add(button_0);
		add(button_dot);
		add(button_reciprocal);
		add(button_equal);
		
	}
	
	public void controlShow(JTextField experssion_area,JTextField result_area)
	{
		
		this.experssion_area=experssion_area;
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"1"));
				}		
				else
				{
					finished=false;
					experssion_area.setText("1");	
					result_area.setText("");
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"2"));
				}
				else
				{
					finished=false;
					experssion_area.setText("2");
					result_area.setText("");
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"3"));
				}
				else
				{
					finished=false;
					experssion_area.setText("3");	
					result_area.setText("");
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"4"));
					
				}	
				else
				{
					finished=false;
					experssion_area.setText("4");	
					result_area.setText("");
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"5"));
				}
				else
				{
					finished=false;
					experssion_area.setText("5");	
					result_area.setText("");
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"6"));
		
				}
				else
				{
					finished=false;
					experssion_area.setText("6");	
					result_area.setText("");
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"7"));
					
				}
				else
				{
					finished=false;
					
					experssion_area.setText("7");
					result_area.setText("");
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"8"));
				}
				else
				{
					finished=false;
					experssion_area.setText("8");	
					result_area.setText("");
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"9"));
				}
				else
				{
					finished=false;
					experssion_area.setText("9");	
					result_area.setText("");
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"0"));
				}
				else
				{
					finished=false;				
					experssion_area.setText("0");	
					result_area.setText("");
				}
			}
		});
		
		
		
		button_pi.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"pi"));
				}
				else
				{
					finished=false;
					experssion_area.setText("pi");	
					result_area.setText("");
				}
			}
		});
		
		button_e.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"e"));
				}
				else
				{
					finished=false;
					experssion_area.setText("e");	
					result_area.setText("");
				}
			}
		});
		
		
		button_dot.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				if(!finished)
				{
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"."));	
				}
				else
				{	
					finished=false;
					experssion_area.setText("0.");	
					result_area.setText("");
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"+"));	
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"-"));	
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"*"));	
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
					experssion_area.setText(StringTool.MathExpression(experssion_area.getText(),"/"));	
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
					result_area.setText(Calc.Compute(experssion_area.getText())+"");
					experssion_area.setText(experssion_area.getText()+"=");	
					finished=true;
				}
			}
		});

		button_reciprocal.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				if(!finished)
				{
				
						experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"recipro"));								
				}		
			}
		});
		
		
		button_squareroot.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				if(!finished)
				{
						
						experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"sqrt"));		
				}				
			}
		});
		
		button_clear.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
	
				finished=false;
				experssion_area.setText("0");	
				result_area.setText("");
			}
		});
		
		button_back.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				if(experssion_area.getText().charAt(experssion_area.getText().length()-1)>='0'&&
				experssion_area.getText().charAt(experssion_area.getText().length()-1)<='9'	||
				experssion_area.getText().charAt(experssion_area.getText().length()-1)=='.'
				)
					experssion_area.setText(
							experssion_area.getText().substring(0,experssion_area.getText().length()-1));
				
				if(experssion_area.getText().length()==0)
				{
					experssion_area.setText("0");
				
				}
			}
		});
		
		button_square.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{
							
						experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"sqr"));		
					
				}				
			}
		});
		
		button_cube.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{
						
						experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"cube"));		
						
				}				
			}
		});
		
		button_sin.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{
							
						experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"sin"));		
					
				}				
			}
		});
		
		button_cos.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{
								
						experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"cos"));		
						
				}				
			}
		});
		
		button_tan.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{
						experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"tan"));		
				
				}				
			}
		});
		
		button_leftbracket.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{	
					
					experssion_area.setText(experssion_area.getText()+"(");			
				}				
			}
		});
		
		button_rightbracket.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{							
					experssion_area.setText(experssion_area.getText()+")");							
				}				
			}
		});
		
		button_arcsin.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{
						
						experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"arcsin"));		
						
				}				
			}
		});
		
		button_arccos.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{
							
						experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"arccos"));		
				}		
			}
		});
		
		button_arctan.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{
						
						experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"arctan"));		
						
				}				
			}
		});
		
		button_exp.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{
							
						experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"exp"));		
					
				}				
			}
		});
		
		button_ln.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{
							
						experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"ln"));		
						
				}				
			}
		});
		
		button_log.addActionListener(new ActionListener() 
		{		
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
				if(!finished)
				{
							
					experssion_area.setText(StringTool.processFunction(experssion_area.getText(),"lg"));		
						
				}				
			}
		});
	}
}
