package com.apple.busOperation;

import java.util.Scanner;

public class TravelAgent 
{
	public static void main(String[] args)
	{
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		do
		{
			BusOperation.operation();
			System.out.println("Press 0 to stop...");
			System.out.println("Press 1 to conti...");
			choice = scan.nextInt();
			
		}while(choice==1);
		scan.close();
	}
}
