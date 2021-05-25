package Tool;

import java.util.regex.*;

public class StringTool 
{
	
	public static String MathExpression(String str,String op)
	{
		String result=str;
		if(op.matches("[1-9]*"))
		{
			char lastch1=str.charAt(str.length()-1);
		
			if(str.equals("0"))
				result=op;
			else if(str.length()>2)	
			{
				char lastch2=str.charAt(str.length()-2);
				if((lastch2=='+'||lastch2=='-'||lastch2=='*'||lastch2=='/')&&lastch1=='0')
					result=str.substring(0,str.length()-1)+op;
				else if(lastch1!=')')
					result=str+op;
			}
			else 
				result=str+op; 
		}
		else if(op.equals("0"))
		{
			int index_dot=str.lastIndexOf('.');
			int index_op=-1;
			String last1=str.substring(str.length()-1);
			String ops[]={"+","-","*","/"};		
			
			for(String s:ops)
			{
				index_op=str.lastIndexOf(s)>index_op?str.indexOf(s):index_op;
			}
	
			if(index_dot>0)
				result=str+"0";
			
			if(last1.matches("[1-9]*"))
				result=str+"0";
			
			if(last1.equals("0")&&index_dot<0)
				result=str+"0";
			
			if(last1.equals("+")||last1.equals("-")||last1.equals("*")||last1.equals("/"))
				result=str+"0";
			
		
			 if(str.length()>2)	
			 {	
				 char lastch2=str.charAt(str.length()-2);
				if((lastch2=='+'||lastch2=='-'||lastch2=='*'||lastch2=='/')&&last1.equals("0"))
					result=str.substring(0,str.length()-1)+op;
				else 
					result=str+op;
			 }
	
			 if(last1.equals(")"))
				result=str;
			 
		}	
		else if(op.equals("."))
		{
			String last1=str.substring(str.length()-1);	
			if(last1.matches("[0-9]*"))
				result=str+".";
					
		}
		else if(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/"))
		{
			String ops[]={"+","-","*","/"};
			int index=-1;	
			for(String s:ops)
			{
				index=str.indexOf(s)>index?str.indexOf(s):index;
			}
			
			if(index<0||(str.charAt(index+1)!='+'&&str.charAt(index+1)!='-'
					&&str.charAt(index+1)!='*'&&str.charAt(index+1)!='/'))
			{
				if(str.charAt(str.length()-1)!='.')
					result=str+op;
			}
		}
		else if(op.equals("pi")||op.equals("e"))
		{	
			char lastch1=str.charAt(str.length()-1);
			if(str.equals("0"))
				result=op;
			else if(str.length()>2)	
			{
				char lastch2=str.charAt(str.length()-2);
				if((lastch2=='+'||lastch2=='-'||lastch2=='*'||lastch2=='/')&&lastch1=='0')
					result=str.substring(0,str.length()-1)+op;
				else if(lastch1!=')')
					result=str+op;
			}
			else 
				result=str+op; 
			
		}
		
		return result;
	}
	
	public static String processFunction(String str,String op)
	{
	
		
		String result=str;
	
		if((str.charAt(str.length()-1)>='0'&&
		   str.charAt(str.length()-1)<='9')
		   ||str.charAt(str.length()-1)==')')
		{
			String ops[]={"+","-","*","/"};
			int index=-1;
				
			for(String s:ops)
			{
				index=str.lastIndexOf(s)>index?str.lastIndexOf(s):index;
			}
					
			if(index>=0)
				result=str.substring(0,index+1)+op+"("+str.substring(index+1)+")";			
			else
				result=op+"("+str+")";
			
			
		}
	
		return result;
	}
	
	
	public static boolean isPositiveInteger(String str)     
	{     
		
		if(str.matches("[0-9]*")&&str.charAt(0)!='0')    
		     return true;
		
		return false;    
	}
	
	public static boolean isInteger(String str)     
	{     
		
		if(str.matches("-?[1-9]*"))
		     return true;	
		return false;    
		
	}
	
	
	public static boolean isDecimalNumber(String str)     
	{     
		
		Pattern pattern1 = Pattern.compile("-?[0-9]*.[0-9]*#?[0-9]*");   
		Matcher isNum1 = pattern1.matcher(str); 
			
		boolean legal=true;
		int flag=str.indexOf('#');
		
		if(str.charAt(0)=='-'&&str.charAt(1)=='0'&&str.charAt(2)!='.')
			legal=false;
		
		if(str.charAt(0)=='0'&&str.charAt(1)!='.')
			legal=false;
			
		if(str.charAt(str.length()-1)=='/')
			legal=false;
		
		if(flag>0)
		{
			String temp_str=str.substring(flag+1);
			
			if(temp_str.matches("0*"))
				legal=false;
		}
		
		if(isNum1.matches()&&str.indexOf('.')>0&&legal)     
		{
			return true;  
		}		
		return false;
	}
}

