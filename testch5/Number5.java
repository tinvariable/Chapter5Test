package testch5;

public class Number5 
{
	public int maxOfThree(int num1, int num2, int num3)
	{
		if (num1 > num2 & num1 > num3)
		{
			return num1;
		}
		if (num2 > num1 & num2 > num3)
		{
			return num2;
		}
		if (num3 > num1 & num3 > num2)
		{
			return num3;
		}
		

	}

}
