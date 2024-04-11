package com.chainsys.CabBooking;

import java.util.Scanner;

public class CabFare {

	public static void main(String[] args)
	{
		Scanner CabFare = new Scanner(System.in);
		CabType ct = new CabType();
		String namePattern = "^[A-Za-z]+$";
		
		System.out.println("Enter Your Name : ");
		String name = CabFare.next();
		
		while(!name.matches(namePattern))
		{
			System.out.println("Invalid UserName\nName should only Alphabets : ");
			name = CabFare.next();
		}
		
		System.out.println("Enter The KiloMeters : ");
		int km = CabFare.nextInt();
		while(km < 0)
		{
			System.out.print("Invalid Data\nRe-Enter the kilomoters : ");
			km = CabFare.nextInt();
		}
		
		System.out.println("Choose the cab type:\n* Micro ( Rs.10 per km )\n* Mini ( Rs.15 per km )\n* Prime (Rs.20 per km)");
		System.out.println("Enter The Cab Type : ");
		String cabType = CabFare.next();
		
		while((!cabType.equalsIgnoreCase("Micro") && (!cabType.equalsIgnoreCase("Mini")) && (!cabType.equalsIgnoreCase("Prime"))))
		{
				System.out.print("Invalid Data\nRe-Enter the Cab type : ");
				cabType = CabFare.next();
		}
			
		if(cabType.equalsIgnoreCase("Micro"))
		{
			int billAmount = ct.microType(km);
			System.out.print("The Bill Amount for Micro Type is : " + ct.microType(km));

			ct.discount(billAmount);
		}
		else if(cabType.equalsIgnoreCase("Mini"))
		{
			int billAmount = ct.miniType(km);
			System.out.print("The Bill Amount for Mini Type is : " + ct.miniType(km));
			ct.discount(billAmount);
		}
		else if(cabType.equalsIgnoreCase("Prime"))
		{
			int billAmount = ct.primeType(km);
			System.out.println("The Bill Amount for Prime Type is : " + ct.primeType(km));
			ct.discount(billAmount);

		}
		
		
	}
	
	
}
