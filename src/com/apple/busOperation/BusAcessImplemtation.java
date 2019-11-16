package com.apple.busOperation;

import java.util.ArrayList;
import java.util.Iterator;



public class BusAcessImplemtation implements BusAcess 
{
	private static ArrayList<Bus> mainBusList = new ArrayList<Bus>();
	@Override
	public void addBus(Bus bus) 
	{
		mainBusList.add(bus);
		System.out.println("Bus added sucessfully...");
	}
	

	@Override
	public ArrayList<Bus> searchBus(String searchStartingPoint, String searchEndingPoint)
	{
		ArrayList<Bus> searchedBusList = new ArrayList<Bus>();
		Iterator<Bus> busIterator = mainBusList.iterator();
		while(busIterator.hasNext())
		{
			Bus receviedBus = busIterator.next();
			String receviedStartingPoint = receviedBus.getFrom();
			String receivedDroppingPoint = receviedBus.getTo();
			boolean fromStatus = receviedStartingPoint.equals(searchStartingPoint);
			boolean toStatus = receivedDroppingPoint.equalsIgnoreCase(searchEndingPoint);
			if(fromStatus && toStatus)
			{
				searchedBusList.add(receviedBus);
			}
		}
		if(searchedBusList.size() != 0)
		{
			return searchedBusList;
		}
		else
		{
			throw new BusNotFoundException();
		}
		
		
	}

	@Override
	public void updateBus(Driver updateNewdriver, String searchedbusNumber)
	{
		Iterator<Bus> busIterator = mainBusList.iterator();
		boolean updatedStatus = false;
		while(busIterator.hasNext())
		{
			Bus receviedBus = busIterator.next();
			String receviedBusNumber = receviedBus.getBusNumber();
			boolean busNumberStatus = receviedBusNumber.equalsIgnoreCase(searchedbusNumber);
			if(busNumberStatus)
			{
				receviedBus.setDriver(updateNewdriver);
				updatedStatus = true;
				break;
			}
		}
		if(updatedStatus)
		{
			System.out.println("Updated Sucessfully...");
		}
		else
		{
			throw new BusNotFoundException();
		}
	}

	
	
}
