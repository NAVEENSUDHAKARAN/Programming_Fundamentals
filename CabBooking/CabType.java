package com.chainsys.CabBooking;

import java.util.Scanner;

public class CabType {

	Scanner discount = new Scanner(System.in);
	String copCode1 = "^[A-Za-z]+\\_5$";
	String copCode2 = "^[A-Za-z]+\\_2$";
	
	public int microType(int num)
	{
		 num *= 10;
		return num;
	}
	
	public  int miniType(int num)
	{
		 num *= 15;
		return num;
	}
	
	public  int primeType(int num)
	{
		 num *= 20;
		return num;
	}
	
	public  int discount(int amount)
	{
		if(amount > 2000 && amount < 5000)
		{
			double discountAmount = amount * 0.02;
			System.out.println("Your Bill Amount is Eligible for 2% Discount\nEnter Coupon code 'COUP_2' : ");
			String code = discount.next();
			
			while(!code.matches(copCode2))
			{
				System.out.println("Invalid Coupon Code\nRe-Enter The Code : ");
				code = discount.next();
			}
			if(code.equalsIgnoreCase("COUP_2"))
			{
				System.out.println("The Total Amount is : " + amount);
				System.out.println("\nThe Discounted Amount is : " + discountAmount);
				System.out.print("The Total Amount is : " + (amount - discountAmount));
			}
			
		}
		else if(amount > 5000)
		{
			double discountAmount = amount * 0.05;
			System.out.println("Your Bill Amount is Eligible for 5% Discount\nEnter Coupon code 'COUP_5' : ");
			String code = discount.next();
			
			while(!code.matches(copCode1))
			{
				System.out.println("Invalid Coupon Code\nRe-Enter The Code : ");
				code = discount.next();
			}
			if(code.equalsIgnoreCase("COUP_5"))
			{
				System.out.println("The Total Amount is : " + amount);
				System.out.println("\nThe Discounted Amount is : " + discountAmount);
				System.out.print("The Final Total Amount is : " + (amount - discountAmount));
			}

				
		}
		else
		{
			amount=0;
	
		}
		return amount;
	}
}
