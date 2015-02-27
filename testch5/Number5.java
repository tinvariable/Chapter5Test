package testch5;

public class Number5 
{
	public int maxOfThree(int num1, int num2, int num3)
	{
		int biggest = 0;
		if (num1 > num2)
		{
			if(num1 > num3)
			{
				biggest = num1;
			}
		}
		if (num2 > num1)
		{
			if(num2 > num3)
			{
				biggest = num2;
			}
		}
		if(num3 > num1)
		{
			if(num3 > num2)
			{
				biggest = num3;
			}
		}
		return biggest;
		
	}

}
