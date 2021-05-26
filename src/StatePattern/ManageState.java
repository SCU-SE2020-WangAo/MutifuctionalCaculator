package StatePattern;

public class ManageState 
{
	
	private String[] state_type ={"Typical","Science","Programmer","Feature"};
	private State state;
	
	
	public String Change(String current_state)
	{	
		for(int i=0;i<state_type.length;++i)
		{		
			if(state_type[i].equals(current_state))
			{
				try
				{
					
					state=(State)Class.forName("StatePattern.State"+current_state).newInstance();
					state.setHelp();
					return state.SendHelp();
				} catch (Exception e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
		return null;
	}
	
	
}
