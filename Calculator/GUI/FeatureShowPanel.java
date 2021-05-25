package GUI;

import java.awt.*;
import javax.swing.*;
import StrategyPattern.*;
import Tool.*;

public class FeatureShowPanel extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	
	private JTextField[] area=new JTextField[7];	
	private Font font=new Font("Dilag",1,15);
	
	
	private int span=15;
	private int height=32;
	private int especial_span=0;
	private int length=190;
	private int adjust=0;
	
	public FeatureShowPanel()
	{
		
		for(int i=0;i<area.length;i++)
			area[i]=new JTextField();
		
		
		this.setLayout(null);
		area[0].setBounds(adjust, span, length, height);
		area[1].setBounds(adjust, 2*span+height, length, height);
		area[2].setBounds(adjust, 3*span+2*height+18,length, height);
		area[3].setBounds(adjust, 3*span+3*height+18,length, height);
		area[4].setBounds(adjust,4*span+4*height+especial_span+18, length, height);
		area[5].setBounds(adjust,4*span+5*height+especial_span+18, length, height);
		area[6].setBounds(adjust, 5*span+7*height+3*especial_span, length, height);
		
		
		area[2].setText("x1=");
		area[3].setText("x2=");
		area[4].setText("(m,n)=");
		area[5].setText("[m,n]=");
		
		
		for(int i=0;i<area.length;i++)
		{
			area[i].setEditable(false);
			area[i].setFont(font);
			this.add(area[i]);
		}		
	}
	
	
	
	public void processFactorization(String str)
	{
		System.out.println("1111111111111111");
		
		if(StringTool.isPositiveInteger(str))
		{
			long temp_num=Integer.parseInt(str);
			area[0].setText(str+"="+MathTool.fun(temp_num).get("factorization")+"");
			
		}
		else
		{
			area[0].setText("���벻�Ϸ�������������");
		}
		
	}
	
	public void process2radical(String str)
	{
		System.out.println("2222222222222222222");
		
		if(StringTool.isPositiveInteger(str))
		{
			long temp_num=Integer.parseInt(str);
			area[1].setText(MathTool.fun(temp_num).get("simplest_squareoot")+"");
			
		}
		else
		{
			area[1].setText("���벻�Ϸ�������������");
		}
	
	}
	
	public void processSolve(String temp_a,String temp_b,String temp_c)
	{
		System.out.println("333333333333333333");
		
		if(temp_a.charAt(0)=='0'||!StringTool.isInteger(temp_b)||!StringTool.isInteger(temp_c))
		{
			
			area[2].setText("���벻�Ϸ�");
			area[3].setText("һԪ���η��̶�����ϵ��Ϊ0��ϵ����������");
		}
		else
		{
			long a=Long.parseLong(temp_a);
			long b=Long.parseLong(temp_b);
			long c=Long.parseLong(temp_c);
			
			SolveEquation solve_eqaution;
			
			if(b*b-4*a*c>0)
				solve_eqaution=new SolveEquation(a, b, c, new DeltaGT0());
			else if(b*b-4*a*c<0)
				solve_eqaution=new SolveEquation(a, b, c, new DeltaLT0());
			else
				solve_eqaution=new SolveEquation(a, b, c, new DeltaEQ0());
			
			solve_eqaution.Solve();
			area[2].setText("x1="+solve_eqaution.getX1());
			area[3].setText("x2="+solve_eqaution.getX2());
		}
		
	
	}
	
	public void processGCDLCM(String m,String n)
	{
		System.out.println("44444444444444444");
		
		if(StringTool.isPositiveInteger(m)&&StringTool.isPositiveInteger(n))
		{
			area[4].setText("(m,n)="+MathTool.GCD(Long.parseLong(m), Long.parseLong(n)));
			area[5].setText("[m,n]="+MathTool.LCM(Long.parseLong(m), Long.parseLong(n)));
		}
		else
		{		
			area[4].setText("���벻�Ϸ�");
			area[5].setText("m��n����������");
		}

	}
	
	public void processFraction(String str)
	{
		
		if(StringTool.isDecimalNumber(str))
		{
			//long temp_num=Integer.parseInt(str);
			area[6].setText("="+MathTool.DecimalToFraction(str));
			System.out.println("55555555555555555");
		}
		else
		{
			area[6].setText("���벻�Ϸ�������С��");
		}
		
		
	}
}
