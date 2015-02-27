package testch5;


public class Number7 
{
	String rev;
	int comp;
	public boolean isPalindrome(String words)
	{
		rev = "";
		int index;
		int length = words.length();
		for (index = length - 1; index >= 0; index--)
		{
			rev = rev + words.charAt(index); 
		}
		if (words.equals(rev))
		{
			return true;
		}
		else
			return false;
	}

}
