package StatePattern;

public class StateScience implements State
{
	
	private String help;
	
	@Override
	public void setHelp() 
	{
		help="3";
	
	}


	@Override
	public String SendHelp() {
		// TODO Auto-generated method stub
		return help;
	}

}
