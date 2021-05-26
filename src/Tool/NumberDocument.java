package Tool;

import javax.swing.text.*;

public class NumberDocument extends PlainDocument 
{
	private static final long serialVersionUID = 1L;
	
	
	int len;
	
	public NumberDocument(int length) 
	{
		len = length;
	}
	
	public void insertString(int offs,String str, AttributeSet a) throws BadLocationException 
	{
		char[] source = str.toCharArray();
		char[] result = new char[source.length];
		int j = 0;
		
		for (int i = 0; i < result.length; i++) 
		{
		  if (getLength() < len) 
		  {
		    result[j++] = source[i];
		  }
		  else 
		  {
			  
		 }
		}
		super.insertString(offs, new String(result, 0, j), a);
	}
} 
