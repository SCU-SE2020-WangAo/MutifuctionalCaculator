package StatePattern;

public class StateProgrammer implements State
{
	
	private String help;
	@Override
	
	public void setHelp()
	{
		help="2";

	}
	@Override
	public String SendHelp() {
		// TODO Auto-generated method stub
		return help;
	}

}
