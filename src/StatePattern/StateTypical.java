package StatePattern;

public class StateTypical implements State
{

	private String help;
	
	@Override
	public void setHelp() 
	{
		// TODO Auto-generated method stub
		help="标准型面板帮助\n\n"
				+ "1、能实现基本的加法、减法、乘法、除法以及开方和取倒数运算。\n\n"
				+ "2、支持连续输入数字和运算符号。\n\n"
				+ "3、表达式一栏显示当前你输入的算式，结果一栏显示算式的运算结果。";
	}

	@Override
	public String SendHelp() 
	{
		// TODO Auto-generated method stub
		return help;
	}

}
