package com.apple.busOperation;

public class InvalidChoiceException extends RuntimeException
{
	@Override
	public String toString() {
		return "Invalid Choice Entered...Choose 1 2 3";
	}
}