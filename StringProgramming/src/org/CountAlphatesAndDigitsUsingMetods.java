package org;

public class CountAlphatesAndDigitsUsingMetods {
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
		public static void alphDigitCount(String s) 
		{
			int alphaCount=0; 
			int digitCount=0;
			for(int i=0;i<=s.length()-1;i++)
			{ 
				char ch = s.charAt(i);
				if(ch>='a' && ch<='z'|| (ch>='A' && ch<='Z'))
				{
					alphaCount++;
				}
				else if(ch>='0' && ch<='9')
				{
					digitCount=digitCount+1;
				}
			}
			System.out.println("AlphaCount : "+alphaCount);
			System.out.println("DigitCount : "+digitCount);
		}
		public static void main(String[] args) 
		{
			String s = "Jsp123";
			if(isEmpty(s))
			{
				System.out.println("String is empty");
			}
			else
			{
				alphDigitCount(s);
			}
			
	}
	}


