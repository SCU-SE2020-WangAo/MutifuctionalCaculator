package BuilderPattern;

public class Director 
{
	public void Construct(Builder builder)
	{
		builder.addShowPanel();
		builder.addButtonPanel();
		builder.Create();	
        }
}
