package testch5;

import java.util.Random;


public class Number10 
{
	Random generator = new Random();
	int gen =generator.nextInt(100) +1;
	
	
	public double randomAverage()
	{
		int gen =generator.nextInt(100) +1;
		int count;
		for (count = 1; count <= 100; count++)
		{
			gen = gen + gen;
		}
		double result = gen/100;
		
		return result;
		
	}

}
