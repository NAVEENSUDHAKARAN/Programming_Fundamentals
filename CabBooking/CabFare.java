package com.chainsys.CabBooking;

import java.util.Scanner;

public class CabFare {

	public static void main(String[] args)
	{
		Scanner CabFare = new Scanner(System.in);
		CabType CT = new CabType();
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
			int billAmount = CT.microType(km);
			System.out.print("The Bill Amount for Micro Type is : " + CT.microType(km));

			CT.discount(billAmount);
		}
		else if(cabType.equalsIgnoreCase("Mini"))
		{
			int billAmount = CT.miniType(km);
			System.out.print("The Bill Amount for Mini Type is : " + CT.miniType(km));
			CT.discount(billAmount);
		}
		else if(cabType.equalsIgnoreCase("Prime"))
		{
			int billAmount = CT.primeType(km);
			System.out.println("The Bill Amount for Prime Type is : " + CT.primeType(km));
			CT.discount(billAmount);

		}
		
		
	}
	
	
}
