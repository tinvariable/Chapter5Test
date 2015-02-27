package testch5;

public class Number9 
{
	public boolean containsPair(int num1, int num2, int num3)
	{
		if (num1 == num2 || num1 == num3 || num2 == num3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
