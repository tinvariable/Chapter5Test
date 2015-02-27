package testch5;
import java.util.Random;
import java.util.stream.IntStream;

public class Number6 
{
	Random generator = new Random();
	public int randomInRange(int num1, int num2)
	{
		int none = 0;
		if (num2 < num1)
		{
			System.out.println("ERROR");
			return none;
		}
		else
		{
			return generator.nextInt(num2) +num1;
			
		}
		
	}

}
