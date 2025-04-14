package org;

public class VowelsInString {
	public static void main(String[] args) {
		String s ="I am a Developer";
		for(int i=0;i<=s.length()-1;i++)
		{
		
		char ch =s.charAt(i);
		  if(Character.isAlphabetic(ch)) 
			{
		
			if((ch== 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch== 'A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
			{
				System.out.println(s.indexOf(ch));
			    }
			}
		}
		
	}
	

}
