package org;

public class EvenIndexCharUsingMethods {
	public static boolean isEmpty(String s)
	{
		if(s.length()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isPresent(String s)
	{
		if(s.length()>10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void evenIndex(String s)
	{
		for(int i=1;i<=s.length()-1;i++)
		{
			if(i%2==0)
			{
				char ch = s.charAt(i);
				System.out.println(ch);
			}
		}
	}
	
public static void main(String[] args) {
	String s = "java language";
	if(isEmpty(s))
	{
		System.out.println("string is empty");
	}
	else
	{
		if(isPresent(s))
		{
			System.out.println("string length is more than 10");
		}
		else
		{
			evenIndex(s);
		}
	}
	
}
}