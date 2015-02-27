package testch5;

public class Number1 
{
	public boolean threeOfAKind(int num1, int num2, int num3)
	{
		if (num1 == num2)
		{
			if (num2 == num3)
			{
				return true;
			}
			else
				return false;
		}
		else
			return false;
		
	}

}
