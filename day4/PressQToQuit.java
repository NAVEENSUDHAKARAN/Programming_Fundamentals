package com.chainsys.day4;

import java.util.ArrayList;
import java.util.Scanner;

public class PressQToQuit {

	public static void main(String[] args)
	{
		Scanner PressQToQuit = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		String str = PressQToQuit.next();
		StringBuilder strBuilder = new StringBuilder();
		
		
		while(!(str.matches("Q")))
		{
			strBuilder.append(str);
				System.out.println(strBuilder);
		}
		
		
		
	}
}
