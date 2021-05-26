package StatePattern;

public class StateProgrammer implements State
{
	
	private String help;
	@Override
	
	public void setHelp()
	{
		help="程序员型面板帮助\n\n"
				+"1、能实现基本的加法、减法、减法、除法运算。\n\n"
				+ "2、计算一栏显示输入数字、运算结果。\n\n"
				+ "3、二进制一栏显示当前你输入的数字二进制形式，结果一栏显示输入的数字和运算结果。\n\n"
				+ "4、Chose键盘用来选择当前运算环境的进制，只有在单选框中选中进制再点击Chose键后才能转换当前运算环境的进制。\n\n"
				+ "5、在16进制的运算环境下“A”~“F”按钮才能点击。\n     在8进制的运算环境下“8”和“9”按钮不能点击。\n     在2进制的运算环境下“2”~“9”按钮不能点击。\n\n"
				+ "6、集成了取模运算(MOD)和常用的位运算与运算（AND）、非运算（NOT）、或运算（OR）、异或运算（XOR）。";

	}
	@Override
	public String SendHelp() {
		// TODO Auto-generated method stub
		return help;
	}

}
