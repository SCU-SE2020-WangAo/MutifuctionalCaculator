package StatePattern;

public class StateTypical implements State
{

	private String help;
	
	@Override
	public void setHelp() 
	{
		// TODO Auto-generated method stub
		help="4";
	}

	@Override
	public String SendHelp() 
	{
		// TODO Auto-generated method stub
		return help;
	}

}
