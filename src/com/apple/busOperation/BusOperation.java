package com.apple.busOperation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class BusOperation
{
	public static void operation()
	{
		BusAcess busAcess = BusAcessObject.getBusAcess();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Choice...");
		System.out.println("Press 1 : To Add Bus...");
		System.out.println("Press 2 : To Search Bus...");
		System.out.println("Press 3 : Update Bus...");

		int choice = scan.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter BusDetails...");
			System.out.println("Enter BusNumber...");
			String busNumber = scan.next();
			System.out.println("Enter BusType...");
			String busType = scan.next();
			System.out.println("Enter Strating Point...");
			String startingPoint = scan.next();
			System.out.println("Enter Dropping Point...");
			String droppingPoint = scan.next();
			System.out.println("Enter Driver's Name...");
			String driverName = scan.next();
			System.out.println("Enter Driver's MobileNumber");
			String driverMobileNumber= scan.next();
			Driver driver = new Driver(driverName, driverMobileNumber);
			Bus bus = new Bus(busNumber, busType, startingPoint, droppingPoint, driver);
			busAcess.addBus(bus);
			System.out.println("Bus is Sucessfully added...");
		}
		else if(choice == 2)
		{
			try
			{
				System.out.println("Enter Starting Point...");
				String startingPoint = scan.nextLine();
				System.out.println("Enter Dropping Point...");
				String droppingPoint = scan.nextLine();
				ArrayList<Bus> searchedBusList = busAcess.searchBus(startingPoint, droppingPoint);
				Iterator<Bus> busIterator = searchedBusList.iterator();
				while(busIterator.hasNext())
				{
					Bus receivedBus = busIterator.next();
					System.out.println(receivedBus);
				}
			}
			catch (BusNotFoundException e) 
			{
				System.out.println(e);		
			}
		}
		else if(choice == 3)
		{
			try
			{
				System.out.println("Enter the bus number...");
				String busNumber = scan.next();
				System.out.println("Enter the drover's Name...");
				String driverName = scan.next();
				System.out.println("enter the driver's mobileNumber");
				String driverMobileNumber = scan.next();
				Driver updateNewDriver = new Driver(driverName,driverMobileNumber);
				busAcess.updateBus(updateNewDriver, busNumber);
			}
			catch (BusNotFoundException e) 
			{
				System.out.println(e);
			}
		}
		else
		{
			throw new InvalidChoiceException();
		}
	}
}
