package org;

public class largestnamepalnadromevowels {
	public static boolean isEmpty(String s)
	{
		if(s.length()==0)
		{
			return null;
		}
		else
		{
			return ;
		}
	}
	public static void isPalandrome(String s)
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
	public static void isLongest(String s) {
		
		String str[]=s.split(" ");
		int length=0;
		String longestString="";
		 for (int i = 0; i <=str.length-1; i++) 
		 {
			if(str[i].length()>length)
			{
				length=str[i].length();
				longestString=str[i];
			}
		}
		 System.out.println("LongestString is: "+longestString);
	
		 }
	public static void isVowels(String s) {
		for(int i=0;i<=s.length()-1;i++)
		{
		
		char ch =s.charAt(i);
		  if(Character.isAlphabetic(ch)) 
			{
		
			if((ch== 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch== 'A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
			{
				System.out.println(ch);
			    }
			}
		}
		
	}
	
	public static void main(String[] args) {
		String s = "I am  a Java Developer";
		if(isEmpty(s))
		{
			System.out.println("String is empty");
		}
		else
		{
			isLongest(s);
			isPalandrome(s);
			isVowels(s);
			
		}
		
	}

	

}
