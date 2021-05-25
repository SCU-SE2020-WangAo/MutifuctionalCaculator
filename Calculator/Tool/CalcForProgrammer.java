package Tool;

public class CalcForProgrammer 
{
	
	private static long prev_num;
	private static long next_num;
	
	public static long getPrev_num() 
	{
		return prev_num;
	}

	public static void setPrev_num(String prev_num,int scale) 
	{
		CalcForProgrammer.prev_num = Long.parseLong(ToScale10(prev_num,scale));
	}

	public static long getNext_num() 
	{
		return next_num;
	}

	public static void setNext_num(String next_num,int scale) 
	{
		CalcForProgrammer.next_num = Long.parseLong(ToScale10(next_num,scale));
	}

	public static String compute(int op,int scale)
	{
		String result="";
		
		if(op==1)
			result=prev_num+next_num+"";
		if(op==2)
			result=prev_num-next_num+"";
		if(op==3)
			result=prev_num*next_num+"";
		if(op==4)
			result=prev_num/next_num+"";
		if(op==5)
			result=(prev_num&next_num)+"";
		if(op==6)
			result=(prev_num|next_num)+"";
		if(op==7)
			result=(prev_num^next_num)+"";
		if(op==9)
			result=prev_num%next_num+"";
		
		if(scale==2)
			result=ToScale2(result);
		if(scale==8)
			result=ToScale8(result);
		if(scale==16)
			result=ToScale16(result);
		
		return result;
	}
	
	public static String processNot(int op,int scale)
	{	
		String result="";
		
		if(op>0)	
		{
			result=~next_num+"";
			
			if(scale==2)
				result=ToScale2(result);
			if(scale==8)
				result=ToScale8(result);
			if(scale==16)
				result=ToScale16(result);

			return result;
		}
		else
		{
			//op!=0ʱ�������������		
			result=~prev_num+"";
			
			if(scale==2)
				result=ToScale2(result);
			if(scale==8)
				result=ToScale8(result);
			if(scale==16)
				result=ToScale16(result);
			
			return result;
		}
		
	}
	public static String ToScale10(String str,int scale)
	{
		long result=0;
			
		if(scale==2)
		{
			for(int i=str.length()-1,j=1;i>=0;--i,j*=2)
				result=result+(str.charAt(i)-'0')*j;
		}
		
		if(scale==8)
		{
			for(int i=str.length()-1,j=1;i>=0;--i,j*=8)
				result=result+(str.charAt(i)-'0')*j;
		}
		
		if(scale==16)
		{
			for(int i=str.length()-1,j=1;i>=0;--i,j*=16)
			{
				if(str.charAt(i)=='A')
					result=result+10*j;
				else if(str.charAt(i)=='B')
					result=result+11*j;
				else if(str.charAt(i)=='C')
					result=result+12*j;
				else if(str.charAt(i)=='D')
					result=result+13*j;
				else if(str.charAt(i)=='E')
					result=result+14*j;
				else if(str.charAt(i)=='F')
					result=result+15*j;
				else	
					result=result+(str.charAt(i)-'0')*j;
			}
		}
		
		if(scale==10)
			return str;
		
		return result+"";		
	}
	
	public static String ToScale2(String str)
	{
		
		String temp_str="";
		long number=Long.parseLong(str);
		
		while(number>=2)
		{
			temp_str=number%2+temp_str+"";
			number/=2;
		}		
		
		return number+temp_str+"";
		
	}
	
	public static String ToScale8(String str)
	{
		String temp_str="";
		long number=Long.parseLong(str);
		
		while(number>=8)
		{
			temp_str=number%8+temp_str+"";
			number/=8;
		}		
		
		return number+temp_str+"";
	}
	
	public static String ToScale16(String str)
	{
		String temp_str="";
		long number=Long.parseLong(str);
					
		while(number>=16)
		{
			if(number%16==10)
				temp_str='A'+temp_str+"";
			else if(number%16==11)
				temp_str='B'+temp_str+"";
			else if(number%16==12)
				temp_str='C'+temp_str+"";
			else if(number%16==13)
				temp_str='D'+temp_str+"";
			else if(number%16==14)
				temp_str='E'+temp_str+"";
			else if(number%16==15)
				temp_str='F'+temp_str+"";
			else
				temp_str=number%16+temp_str+"";
			number/=16;
		}
			
			if(number==10)
				temp_str='A'+temp_str+"";
			else if(number==11)
				temp_str='B'+temp_str+"";
			else if(number==12)
				temp_str='C'+temp_str+"";
			else if(number==13)
				temp_str='D'+temp_str+"";
			else if(number==14)
				temp_str='E'+temp_str+"";
			else if(number==15)
				temp_str='F'+temp_str+"";
			else 
				temp_str=number+temp_str+"";			
		return temp_str;
		
	}
	
	public static String binaryData(String str)
	{
		String tempstr=str;
		String result="";
		String[] substr=new String[8];
		
		for(int i=0;i<32-str.length();++i)
			tempstr="0"+tempstr;
			
		for(int i=0;i<8;i++)
		{
			substr[i]=tempstr.substring(4*i, 4*i+4);
			result=result+substr[i]+",";
		}
		
		return result.substring(0,result.length()-1);
	}
	
}
