package StrategyPattern;

import Tool.MathTool;

public class DeltaLT0 implements DeltaStrategy
{
	
	
	private long a,b,c,delta;
	private String x1,x2;
	private long temp_numerator,temp_denominator;
	private long temp_b,temp_square_delta,temp_multiple,temp_delta_root;
	

	@Override
	public void process() 
	{
		
		
		if(MathTool.isFullSquare(-delta))
		{
		
			temp_numerator=-b-MathTool.get2Root(-delta);
			temp_denominator=2*a;
			x1=MathTool.reductionOfFraction(temp_numerator,temp_denominator)+"*i";
				
				temp_numerator=-b+MathTool.get2Root(-delta);
				temp_denominator=2*a;
				x2=MathTool.reductionOfFraction(temp_numerator,temp_denominator)+"*i";	
			}
			else
			{
				
				temp_multiple=(Long)MathTool.fun(-delta).get("multiple");
				
				if(temp_multiple==1)
				{
					
					temp_denominator=2*a;
					temp_b=-b;
					x1="("+temp_b+"-��"+(-delta)+"*i)/"+temp_denominator;
					x2="("+temp_b+"+��"+(-delta)+"*i)/"+temp_denominator;	
				}
				else
				{
					
					temp_multiple=(Long)MathTool.fun(-delta).get("multiple");
				
					
					if(temp_multiple==1)
					{
						
						temp_denominator=2*a;
						temp_b=-b;
						x1="("+temp_b+"-��"+delta+")/"+temp_denominator;
						x2="("+temp_b+"+��"+delta+")/"+temp_denominator;	
					}
					else
					{
						
						temp_denominator=2*a;
						temp_b=-b;
						temp_delta_root=(Long)MathTool.fun(-delta).get("root");
						
						if(b==0)
						{
							long gcd=MathTool.GCD(temp_multiple,Math.abs(temp_denominator));
							
							if(gcd==1)
							{
								if(temp_multiple==1)
								{
									x1="-��"+temp_delta_root+"*i/"+temp_denominator;
									x2="��"+temp_delta_root+"*i/"+temp_denominator;
								}	
								if(temp_multiple!=1)
								{
									x1="-"+temp_multiple+"��"+temp_delta_root+"*i/"+temp_denominator;
									x2=temp_multiple+"��"+temp_delta_root+"*i/"+temp_denominator;
								}		
							}
							if(gcd!=1)
							{
								if(temp_multiple/gcd==1)
								{
									if(temp_denominator/gcd==1)
									{
										x1="-��"+temp_delta_root+"*i";
										x2="��"+temp_delta_root+"*i";
									}	
									if(temp_denominator/gcd!=1)
									{
										x1="-��"+temp_delta_root+"*i/"+temp_denominator/gcd;
										x2="��"+temp_delta_root+"*i/"+temp_denominator/gcd;
									}						
								}
								if(temp_multiple/gcd!=1)
								{
									if(temp_denominator/gcd==1)
									{
										x1="-"+temp_multiple/gcd+"��"+temp_delta_root+"*i";
										x2=temp_multiple/gcd+"��"+temp_delta_root+"*i";						
									}
										
									if(temp_denominator/gcd!=1)
									{
										x1="-"+temp_multiple/gcd+"��"+temp_delta_root+"*i/"+temp_denominator/gcd;
										x2=temp_multiple/gcd+"��"+temp_delta_root+"*i/"+temp_denominator/gcd;						
									}
									
										
								}							
							}		
						}
						
						if(b!=0)
						{
								
							long gcd=MathTool.GCD(Math.abs(temp_b),temp_multiple,Math.abs(temp_denominator));
							if(gcd==1)
							{
								if(temp_multiple==1)
								{
									x1="("+temp_b+"-��"+temp_delta_root+"*i)/"+temp_denominator;
									x2="("+temp_b+"+��"+temp_delta_root+"*i)/"+temp_denominator;
								}	
								if(temp_multiple!=1)
								{
									x1="("+temp_b+"-"+temp_multiple+"��"+temp_delta_root+"*i)/"+temp_denominator;
									x2="("+temp_b+"+"+temp_multiple+"��"+temp_delta_root+"*i)/"+temp_denominator;
								}		
							}	
							if(gcd!=1)
							{	
								if(temp_multiple/gcd==1)
								{
									if(temp_denominator/gcd==1)
									{
										x1=temp_b/gcd+"-��"+temp_delta_root+"*i";
										x2=temp_b/gcd+"+��"+temp_delta_root+"*i";
									}	
									if(temp_denominator/gcd!=1)
									{
										x1="("+temp_b/gcd+"-��"+temp_delta_root+"*i)/"+temp_denominator/gcd;
										x2="("+temp_b/gcd+"+��"+temp_delta_root+"*i)/"+temp_denominator/gcd;
									}						
								}
								if(temp_multiple/gcd!=1)
								{

									if(temp_denominator/gcd==1)
									{
										x1=temp_b/gcd+"-"+temp_multiple/gcd+"��"+temp_delta_root+"*i";
										x2=temp_b/gcd+"+"+temp_multiple/gcd+"��"+temp_delta_root+"*i";					
									}
									
									if(temp_denominator/gcd!=1)
									{
										x1="("+temp_b/gcd+"-"+temp_multiple/gcd+"��"+temp_delta_root+"*i)/"+temp_denominator/gcd;
										x2="("+temp_b/gcd+"+"+temp_multiple/gcd+"��"+temp_delta_root+"*i)/"+temp_denominator/gcd;					
									}
									
								}							
							}
						
						}
				
					}
				}
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
