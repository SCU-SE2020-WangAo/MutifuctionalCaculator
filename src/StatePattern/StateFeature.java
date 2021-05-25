package StatePattern;

public class StateFeature implements State
{
	
	private String help;
	@Override
	public void setHelp() 
	{
		// TODO Auto-generated method stub
		help="1";
		
	}
	@Override
	public String SendHelp() 
	{
		// TODO Auto-generated method stub
		return help;
	}
	
}
