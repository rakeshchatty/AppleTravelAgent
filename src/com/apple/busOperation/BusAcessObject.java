package com.apple.busOperation;

public class BusAcessObject
{
	public static BusAcess getBusAcess()
	{
		BusAcess busAcess = new BusAcessImplemtation();
		return busAcess;
	}
	
	
}
