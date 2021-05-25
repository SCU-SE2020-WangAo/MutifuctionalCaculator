package StrategyPattern;

import Tool.MathTool;

public class DeltaEQ0 implements DeltaStrategy
{
	
	
	private long a,b,c,delta;
	private String x1,x2;
	private long temp_numerator,temp_denominator;
	private long temp_b,temp_square_delta,temp_multiple,temp_delta_root;
	
	@Override
	public void process() 
	{
		
		if(b!=0)
		{
			x1=MathTool.reductionOfFraction(-b, 2*a);
			x2=MathTool.reductionOfFraction(-b, 2*a);
		}
			
		if(b==0)
		{
			x1="0";
			x2="0";
		}
			
	}

	@Override
	public String getX1() 
	{
		// TODO Auto-generated method stub
		return x1;
	}

	@Override
	public String getX2() 
	{
		// TODO Auto-generated method stub
		return x2;
	}

	@Override
	public void setA(long a) {
		// TODO Auto-generated method stub
		this.a=a;
		
	}

	@Override
	public void setB(long b) {
		// TODO Auto-generated method stub
		this.b=b;
	}

	@Override
	public void setC(long c) {
		// TODO Auto-generated method stub
		this.c=c;
	}

	@Override
	public void setDelta(long delta) {
		// TODO Auto-generated method stub
		this.delta=delta;
	}

}
