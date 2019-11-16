package com.apple.busOperation;

public class Bus {
	private String busNumber; 
	private String busType;
	private String from;
	private String to;
	private Driver driver;
	
	public Bus(String busNumber, String busType, String from, String to, Driver driver) 
	{ 
		super();
		this.busNumber = busNumber;
		this.busType = busType;
		this.from = from;
		this.to = to;
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", busType=" + busType + ", startingPoint=" + from + ", droppingPoint=" + to + ", driver=" + driver + "]";
	}
	public String getBusNumber()
	{
		return this.busNumber;
		
	}
	public String getBusType()
	{
		return this.busType;
	}
	public String getFrom()
	{
		return this.getFrom();
	}
	public String getTo()
	{
		return this.to;
	}
	public Driver getDriver()
	{
		return this.driver;
	}
	public void setDriver(Driver driver)
	{
		this.driver=driver;
	}
	
}
