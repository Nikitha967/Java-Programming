package org;

public class ReverseaStringMethod {
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
		System.out.println(srev);
	}
	public static void main(String[] args) {
		String s = "java";
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
