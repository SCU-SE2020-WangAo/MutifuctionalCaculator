package Tool;

import StrategyPattern.*;

public class SolveEquation 
{
	
	private long a,b,c;
	private long delta; 
	private String x1,x2;
	private DeltaStrategy delta_strategy;
	
	public String getX1() {
		return x1;
	}

	public void setX1(String x1) {
		this.x1 = x1;
	}

	public String getX2() {
		return x2;
	}

	public void setX2(String x2) {
		this.x2 = x2;
	}

	public SolveEquation(long input_a,long input_b,long input_c,DeltaStrategy delta_strategy)
	{
		
		if(input_a>0)
		{	
			a=input_a;
			b=input_b;
			c=input_c;
			delta=b*b-4*a*c;		
		}
		else
		{
			
			a=-input_a;
			b=-input_b;
			c=-input_c;
			delta=b*b-4*a*c;		
		}
		
		this.delta_strategy=delta_strategy;
	}
	
	
	public void Solve()
	{
		delta_strategy.setA(a);
		delta_strategy.setB(b);
		delta_strategy.setC(c);
		delta_strategy.setDelta(delta);
		delta_strategy.process();
		
		this.x1=delta_strategy.getX1();
		this.x2=delta_strategy.getX2();
	}
	
}

