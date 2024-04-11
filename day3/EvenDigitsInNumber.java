package com.chainsys.day3;

import java.util.Scanner;

public class EvenDigitsInNumber {

	public static void main(String[] main)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Number = scanner.nextInt();
		
		ValidationChecker Check = new ValidationChecker();
		if(Check.Numerics(Number))
		{
			for(int i=0; i<Number; i+=1)
			{
				int safe = Number % 10;
				if(safe % 2 == 0)
				{
					System.out.println(safe);
				}
				Number /= 10;	
			}
		}
	}
}
