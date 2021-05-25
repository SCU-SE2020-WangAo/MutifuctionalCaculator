package StrategyPattern;

public interface DeltaStrategy 
{
	
	
	public void setA(long a);
	public void setB(long b);
	public void setC(long c);
	public void setDelta(long delta);
	
	
	public void process();
	
	public String getX1();
	public String getX2();	
		
}
