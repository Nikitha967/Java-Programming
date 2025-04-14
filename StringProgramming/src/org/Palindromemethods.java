package org;

public class Palindromemethods {
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
	public static void isReverse(String s)
	{
		String srev = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch =s.charAt(i);
			srev=srev+ch;
		}
		if(s.equalsIgnoreCase(srev))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
	}
	public static void main(String[] args) {
		String s = "Dad";
		if(isEmpty(s))
		{
			System.out.println("String is empty");
		}
		else
		{
			isReverse(s);
		}
	}

}
