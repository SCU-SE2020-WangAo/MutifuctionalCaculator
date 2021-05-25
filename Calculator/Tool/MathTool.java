package Tool;

import java.math.*;
import java.util.*;


public class MathTool
{
	public static long GCD(long num1,long num2)
	{
		
		while(num1!=num2)
		{
			if(num1>num2)
				num1=num1-num2;
			if(num2>num1)
				num2=num2-num1;
		}
		return num1;	
	}
	public static long GCD(long num1,long num2,long num3)
	{
		
		return GCD(num1,GCD(num2,num3));	
	}
	

	public static long LCM(long num1,long num2)
	{
            
		return num1*num2/GCD(num1,num2);
	}
	
	public static boolean isFullSquare(long num)
	{
		
		long i = 1; 
		for(;num>0;i+=2) 
			num-=i; 
		return 0==num;
	}
	
	public static long get2Root(long num)
	{
		
		return (long)Math.sqrt(num);
	}
	
	public static boolean isPrime(long num)
	{
		
		if(num<=1) return false;
		if(num==2||num==3) return true;
		if(num%2==0) return false;
		
		for(long i=3;i<=Math.sqrt(num);i+=2)
			if(num%i==0) return false;
		
		return true;
	}
	
	public static HashMap fun(long num)
	{
		
		HashMap simplestSquareroot=new HashMap();
		ArrayList<Long> prime=new ArrayList<Long>();
		ArrayList<Long> index=new ArrayList<Long>();
		
		long  tempnum1=num,tempnum2=num;
		long  count1=0,count2=0;
		long  multiple=1,tempindex,root;
		
		String str="";
		
		if(isPrime(num))
		{
			 root=num;
			 simplestSquareroot.put("multiple", multiple);
			 simplestSquareroot.put("root", root);
			 simplestSquareroot.put("simplest_squareoot","��"+root);
			 simplestSquareroot.put("root_decimal",Math.sqrt(root));
			 simplestSquareroot.put("factorization", num);
			 
			 return  simplestSquareroot;
		}
		else
		{
			for(long i=2;i<num;i++)
			 {
				if(isPrime(i)&&num%i==0)
				{
					prime.add(i);
					count1++;
				}
			 }
			 
			 for(int i=0;i<prime.size();++i)
			 {
				 index.add(0l);
 
				 while(tempnum1%prime.get(i)==0)
				 {
					 tempnum1/=prime.get(i);
					 tempindex=index.get(i).longValue();
					 index.set(i,++tempindex);	
				 }
			 }
			 
			 for(int i=0;i<prime.size();i++)
			 {
				 if(index.get(i)==1)
					 str+=prime.get(i)+"*";
				 else
					 str+=prime.get(i)+"^"+index.get(i)+"*";
			 }	 	 
			str=str.substring(0,str.length()-1);
			 
			 for(int i=0;i<prime.size();i++)
			 {
				 multiple*=(int)Math.pow(prime.get(i),index.get(i)/2);
			 }
			 
			 root=tempnum2/(multiple*multiple);
			 
			 simplestSquareroot.put("multiple", multiple);
			 simplestSquareroot.put("root", root);
			 
			 if(multiple==1)
				 simplestSquareroot.put("simplest_squareoot","��"+root);
			 else if(root==1)
				 simplestSquareroot.put("simplest_squareoot",multiple);
			 else
				 simplestSquareroot.put("simplest_squareoot",multiple+"��"+root);
			
			 simplestSquareroot.put("root_decimal",multiple*Math.sqrt(root));
			 simplestSquareroot.put("factorization", str);
			 
			 return  simplestSquareroot;
		}
	}
	
	public static String reductionOfFraction(long numerator,long denominator)
	{
		
		String x0;
		
		long temp_numerator=numerator,temp_denominator=denominator;
		numerator=Math.abs(numerator);
		denominator=Math.abs(denominator);
		
		if(GCD(numerator,denominator)==1)
		{
			if(temp_numerator*temp_denominator<0)
				x0="-"+numerator+"/"+denominator;
			else
				x0=numerator+"/"+denominator;
		}
		else
		{
			if(denominator/GCD(numerator,denominator)==1)
			{
				if(temp_numerator*temp_denominator<0)
					x0="-"+numerator/GCD(numerator,denominator);
				else
					x0=numerator/GCD(numerator,denominator)+"";
			}
			else
			{
				if(temp_numerator*temp_denominator<0)
					x0="-"+numerator/GCD(numerator,denominator)
					+"/"+denominator/GCD(numerator,denominator);
				else	
					x0=numerator/GCD(numerator,denominator)
					+"/"+denominator/GCD(numerator,denominator);
			}
		}	
		return x0;	
	}
	


	public static String BigIntegerReduction(BigInteger numerator,BigInteger denominator)
	{
		
		String x0="";
		
		BigInteger temp_numerator=numerator,temp_denominator=denominator;
		BigInteger b1=new BigInteger("1");

		numerator=numerator.abs();
		denominator=denominator.abs();

		BigInteger gcd=numerator.gcd(denominator);
		
		if(gcd.equals(b1))
		{
			if(temp_numerator.multiply(temp_denominator).toString().charAt(0)=='-')
				x0="-"+numerator+"/"+denominator;
			else
				x0=numerator+"/"+denominator;
		}
		else
		{
			if(denominator.divide(gcd).equals(b1))
			{
				if(temp_numerator.multiply(temp_denominator).toString().charAt(0)=='-')
					x0="-"+numerator.divide(gcd);
				else
					x0=""+numerator.divide(gcd);
			}
			else
			{
				if(temp_numerator.multiply(temp_denominator).toString().charAt(0)=='-')
					x0="-"+numerator.divide(gcd)+"/"+denominator.divide(gcd);
				else
					x0=numerator.divide(gcd)+"/"+denominator.divide(gcd);
			}
		}		
		return x0;	
	}
	
	
	public static String DecimalToFraction(String num)
	{
		String result="";
		String temp_num;
		BigInteger integer,fn,fd,circle,fd2,ten=new BigInteger("10");
	 
		if(num.indexOf('#')<0)
		{
			if(num.charAt(0)=='-')
			{
				temp_num=num.substring(1);
	
				integer=new BigInteger(temp_num.substring(0,temp_num.indexOf('.')));
				fn=new BigInteger(temp_num.substring(temp_num.indexOf('.')+1));
				fd=ten.pow(temp_num.substring(temp_num.indexOf('.')+1).length());
					
				result="-"+BigIntegerReduction(integer.multiply(fd).add(fn),fd);
			}
			else
			{
				integer=new BigInteger(num.substring(0,num.indexOf('.')));
				fn=new BigInteger(num.substring(num.indexOf('.')+1));
				fd=ten.pow(num.substring(num.indexOf('.')+1).length());
					
				result=BigIntegerReduction(integer.multiply(fd).add(fn),fd);
			}	
		}
		else
		{
				
			if(num.charAt(0)=='-')
			{
				temp_num=num.substring(1);
	
				integer=new BigInteger(temp_num.substring(0,temp_num.indexOf('.')));
				
				if(temp_num.substring(temp_num.indexOf('.')+1,temp_num.indexOf('#')).length()>0)
					fn=new BigInteger(temp_num.substring(temp_num.indexOf('.')+1,temp_num.indexOf('#')));
				else
					fn=new BigInteger("0");
				
				if(temp_num.substring(temp_num.indexOf('.')+1,temp_num.indexOf('#')).length()==0)
					fd=ten.pow(0);
				else
					fd=ten.pow(fn.toString().length());
				
				
				
				circle=new BigInteger(temp_num.substring(temp_num.indexOf('#')+1));
				
			
				
				int times=temp_num.substring(temp_num.indexOf('#')+1).length();
				String nine="";
				for(int i=0;i<times;++i)
					nine+="9";
				
				fd2=new BigInteger(nine);
				
				result="-"+BigIntegerReduction(
					integer.multiply(fd).multiply(fd2).add(fn.multiply(fd2)).add(circle)	
						,fd.multiply(fd2));
				
				System.out.println(integer);
				System.out.println(fn);
				System.out.println(fd);
				System.out.println(circle);
				System.out.println(fd2);
				System.out.println("----------------------");
				System.out.println(integer.multiply(fd).multiply(fd2).add(fn.multiply(fd2)).add(circle).multiply(fd));
				System.out.println(fd.multiply(fd2));
				System.out.println("----------------------");
				
			}
			else
			{
				integer=new BigInteger(num.substring(0,num.indexOf('.')));
				
				if(num.substring(num.indexOf('.')+1,num.indexOf('#')).length()>0)
					fn=new BigInteger(num.substring(num.indexOf('.')+1,num.indexOf('#')));
				else
					fn=new BigInteger("0");
				
				if(num.substring(num.indexOf('.')+1,num.indexOf('#')).length()==0)
					fd=ten.pow(0);
				else
					fd=ten.pow(fn.toString().length());
				
				circle=new BigInteger(num.substring(num.indexOf('#')+1));
				
				int times=num.substring(num.indexOf('#')+1).length();
				String nine="";
				for(int i=0;i<times;++i)
					nine+="9";
				
				fd2=new BigInteger(nine);
				
				result=BigIntegerReduction(
					integer.multiply(fd).multiply(fd2).add(fn.multiply(fd2)).add(circle)
						,fd.multiply(fd2));
				
				System.out.println("----------------------");
				System.out.println(integer);
				System.out.println(fn);
				System.out.println(fd);
				System.out.println(circle);
				System.out.println(fd2);
				System.out.println("----------------------");
				System.out.println(integer.multiply(fd).multiply(fd2).add(fn.multiply(fd2)).add(circle).multiply(fd));
				System.out.println(fd.multiply(fd2));
				System.out.println("----------------------");
			}	
				
		}
		
		return result;	
	}

}