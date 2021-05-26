package Tool;

public class Calc
{
    
	private static String[] spop = {"asin", "acos", "atan", "csc", "sec", "cot", "sin", "cos", "tan", "lg", "ln", "abs", "rnd", "exp","sqrt", "recipro","sqr","cube","e", "pi"};

	public static double Compute(String expression)
	{
		expression = ChkSpc(expression);
		expression = ChkSpc(expression);
		if (expression.charAt(0) == '(' && expression.charAt(expression.length() - 1) == ')')
		{
			return Compute(expression.substring(1, 1 + expression.length() - 2));
		}
		if (InStrCount(expression, new char[] {'+', '-', '*', '/', '^'}) == 0)
		{
			return Double.parseDouble(expression);
		}
		int pCount = 0;
		char ch = '\0';
		String exp1 = "";
		String exp2 = "";
		for (int i = expression.length(); i >= 1; i--)
		{
			ch = expression.charAt(i - 1);
			
			if (ch == '(')
			{
				pCount += 1;
			}

			else if (ch == ')')
			{
				pCount -= 1;
			}

			else if (ch == '+')
			{
				if (pCount == 0)
				{
					if (! (i > 1 && expression.charAt(i - 2) == '^'))
					{
						return Compute(expression.substring(0, i - 1)) + Compute(expression.substring(i, expression.length()));
					}else{
						return Math.pow(Compute(expression.substring(0, i - 2)), Compute(expression.substring(i, expression.length())));
					}
				}
			}
			else if (ch == '-')
			{
				if (pCount == 0)
				{
					if (! (i > 1 && expression.charAt(i - 2) == '^'))
					{
						return Compute(expression.substring(0, i - 1)) - Compute(expression.substring(i, expression.length()));
					}else{
						return Math.pow(Compute(expression.substring(0, i - 2)), -Compute(expression.substring(i, expression.length())));
					}
				}
			}
		}
		for (int i = expression.length(); i >= 1; i--)
		{
			ch = expression.charAt(i - 1);
			if (ch == '(')
			{
				pCount += 1;
			}
			else if (ch == ')')
			{
				pCount -= 1;
			}
			else if (ch == '*')
			{
				if (pCount == 0)
				{
					return Compute(expression.substring(0, i - 1)) * Compute(expression.substring(i, expression.length()));
				}
			}
			else if (ch == '/')
			{
				if (pCount == 0)
				{
					return Compute(expression.substring(0, i - 1)) / Compute(expression.substring(i, expression.length()));
				}
			}
		}
		for (int i = expression.length(); i >= 1; i--)
		{
			ch = expression.charAt(i - 1);
			if (ch == '(')
			{
				pCount += 1;
			}
			else if (ch == ')')
			{
				pCount -= 1;
			}
			else if (ch == '^')
			{
				if (pCount == 0)
				{
					return (Math.pow(Compute(expression.substring(0, i - 1)), Compute(expression.substring(i, expression.length()))));
				}
			}
		}

		return 0;
	}

	private static int InStrCount(String sourceString, char[] chr)
	{
		int count = 0;
		for (char ch : chr)
		{
			for (int i = 1; i < sourceString.length(); i++)
			{
				if (sourceString.charAt(i) == ch )
				{
					count += 1;
				}
			}
		}
		return count;
	}

	private static int InStrCount(String sourceString, String str)
	{
		int count = 0;
		while (sourceString.indexOf(str) + 1 != -1)
		{
			count += 1;
			sourceString = sourceString.substring(sourceString.length() - (sourceString.length() - sourceString.indexOf(str) + 1));
		}
		return count;
	}

	private static String ChkSpc(String sourceString)
	{
		sourceString = sourceString.toLowerCase();
		for (String op : spop)
		{
			if (sourceString.indexOf(op) + 1 > 0)
			{
				return ChkSpc(SearchSpecialOp(sourceString, op));
			}
		}
		return sourceString;
	}

	private static String SearchSpecialOp(String sourceString, String op)
	{
		if ((op.equals("sin")) || (op.equals("cos")) || (op.equals("tan")) || (op.equals("csc")) || (op.equals("sec")) || (op.equals("cot")) || (op.equals("asin")) || (op.equals("acos")) || (op.equals("atan")) || (op.equals("lg")) || (op.equals("ln")) || (op.equals("abs")) || (op.equals("rnd")) ||(op.equals("exp"))|| (op.equals("sqrt"))||(op.equals("recipro"))||(op.equals("sqr"))||(op.equals("cube")))
		{
			int l = sourceString.indexOf(op) + 1;
			char c = '\0';
			int pCount = 0;
			double result = 0;
			double nm = 0;
			for (int i = l + op.length(); i <= sourceString.length(); i++)
			{
				c = sourceString.charAt(i - 1);
				if (c == '(')
				{
					pCount += 1;
				}
				else if (c == ')')
				{
					pCount -= 1;
					if (pCount == 0)
					{
						nm = Compute(sourceString.substring(l + op.length(), l + op.length() + i - (l + op.length() + 1)));
						if (op.equals("sin"))
						{
							result = Math.sin(nm);
						}
						else if (op.equals("cos"))
						{
							result = Math.cos(nm);
						}
						else if (op.equals("tan"))
						{
							result = Math.tan(nm);
						}
						else if (op.equals("csc"))
						{
							result = 1 / Math.sin(nm);
						}
						else if (op.equals("sec"))
						{
							result = 1 / Math.cos(nm);
						}

						else if (op.equals("cot"))
						{
							result = 1 / Math.tan(nm);
						}
						
						else if (op.equals("asin"))
						{
							result = Math.asin(nm);
						}

						else if (op.equals("acos"))
						{
							result = Math.acos(nm);
						}

						else if (op.equals("atan"))
						{
							result = Math.atan(nm);
						}

						else if (op.equals("lg"))
						{
							result = Math.log10(nm);
						}

						else if (op.equals("ln"))
						{
							result = Math.log(nm);
						}

						else if (op.equals("abs"))
						{
							result = Math.abs(nm);
						}

						else if (op.equals("rnd"))
						{
							result = Math.random() * nm;
						}
						else if(op.equals("exp"))
						{
							result = Math.exp(nm);
						}
						else if (op.equals("sqrt"))
						{
							result = Math.sqrt(nm);
						}
						else if(op.equals("recipro"))
						{
							result =1/nm;
						}
						else if(op.equals("sqrt"))
						{
							result =nm*nm;
						}
						else if(op.equals("cube"))
						{
							result =nm*nm*nm;
						}
						
						return sourceString.substring(0, l - 1) + result + sourceString.substring(i, sourceString.length());
					}
				}
			}
		}
		else if ((op.equals("e")) || (op.equals("pi")))
		{
			String cst = null;
			int lo = sourceString.indexOf(op) + 1;

			if (op.equals("e"))
			{
				cst = (! (lo > 1 && Character.isDigit(sourceString.charAt(lo - 2)))) ? String.valueOf(Math.E) : "*10^";
			}

			else if (op.equals("pi"))
			{
				cst = String.valueOf(Math.PI);
			}
			return sourceString.substring(0, lo - 1) + cst + sourceString.substring(lo + op.length() - 1, lo + op.length() - 1 + sourceString.length() - lo - op.length() + 1);
		}

		return null;
	}
}




