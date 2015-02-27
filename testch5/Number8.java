package testch5;

public class Number8 
{
	
	public int countSpaces(String words)
	{
		int spaces = 0;
		char space = ' ';
		for (int count = 0; count <= words.length(); count++)
		{
			if (words.charAt(count) == space)
			{
				spaces++;
			}
		}
		
		
		
		
		
		return spaces;
	}

}
