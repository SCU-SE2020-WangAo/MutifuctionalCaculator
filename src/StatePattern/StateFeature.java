package StatePattern;

public class StateFeature implements State
{
	
	private String help;
	@Override
	public void setHelp() 
	{
		// TODO Auto-generated method stub
		help="特色型面板帮助\n\n"
				+ "1、实现分解质因\n将一个正整数分解为它所有质因数的幂积形式,如108=2^2*3^3且输入的数只为正整数。\n\n"
				+ "2、最简二次根式\n求最简二次根式。输入的数只为正整数。\n\n"
				+ "3、解整系数一元二次方程，且保留根式\n求一个整系数一元二次方程精确解，而不是表示为小数的近似值,\n并且能计算△<0时的复数解。输入的数只为整数并且二次项系数不为0。\n\n"
				+ "4、求两个正整数的最大公约数和最小公倍数\n输入的数只为正整数。\n\n"
				+ "5、小数转分数 循环节开始记为#\n将有限小数和无限循环小数（纯循环小数和混循环小数）转为分数,\n其中循环节开始记为#，比如\n说0.0#3表示0.03333333333333....，比如2.1#3=32/15。且输入的数只为小数。";
		
	}
	@Override
	public String SendHelp() 
	{
		// TODO Auto-generated method stub
		return help;
	}
	
}
