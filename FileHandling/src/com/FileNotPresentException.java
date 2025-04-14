package com;

public class FileNotPresentException extends RuntimeException 
{
	@Override
	public String toString() 
	{
		return getClass()+ " : File is not Present "	;	
	}




}
