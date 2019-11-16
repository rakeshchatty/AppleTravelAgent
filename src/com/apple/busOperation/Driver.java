package com.apple.busOperation;

public class Driver
{
	private String driverName;
	private String driverMobileNumber;
	
	public Driver(String driverName, String driverMobileNumber) {
		super();
		this.driverName = driverName;
		this.driverMobileNumber = driverMobileNumber;
	}

	@Override
	public String toString() {
		return "Driver [driverName=" + driverName + ", driverMobileNumber=" + driverMobileNumber + "]";
	}
	
	
	
}
