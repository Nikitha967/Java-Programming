package org;

public class SumofASCIIMetods {

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
	public static boolean hasDigits(String s)
	{
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				return true;
			}
		}
		return false;
	}
	public static void convertStringToAscii(String s)
	{
		int sum=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			sum = sum+ch;
		}
		System.out.println(sum);
	}
		
public static void main(String[] args) 
{
	String s = "ABCD";
	if(isEmpty(s))
	{
		System.out.println("String is empty");
	}
	else
	{
		if(hasDigits(s))
		{
			System.out.println("string contain digits in it");
		}
		else 
		{
			convertStringToAscii(s);
		}
	}
}
}
