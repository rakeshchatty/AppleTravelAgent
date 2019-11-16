package com.apple.busOperation;

import java.util.ArrayList;

public interface BusAcess 
{
	void addBus(Bus bus);
	ArrayList<Bus> searchBus(String startingPoint, String droppingPoint);
	void updateBus(Driver driver, String busNumber);
	
}
