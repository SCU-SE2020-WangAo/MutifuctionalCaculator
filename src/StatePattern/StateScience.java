package StatePattern;

public class StateScience implements State
{
	
	private String help;
	
	@Override
	public void setHelp() 
	{
		help="科学型面板帮助\n\n"
				+ "1、能实现基本的加法、减法、乘法、除法以及开方和取倒数运算。\n\n"
				+ "2、支持连续输入数字和运算符号。\n\n"
				+ "3、表达式一栏显示当前你输入的算式，结果一栏显示算式的运算结果。\n\n"
				+ "4、能输入有括号的四则混合运算算式，能进行求平方运算、求立方运算。\n\n"
				+ "5、集成了常见的初等函数，如正弦函数、余弦函数、正切函数、\n反正弦函数、反余弦函数、反正切函数、自然指数函数、\n自然对数函数、常用对数函数。\n\n"
				+ "6、能输入特殊的数字：圆周率pai和自然常数e。";
	
	}


	@Override
	public String SendHelp() {
		// TODO Auto-generated method stub
		return help;
	}

}
