package org;

public class CountDigitAlpha {
	
	public static void main(String[] args) {
		String s="Jsp123";
		int AlphaCount =0;
		int digitCount =0;
	
		for(int i=0;i<=s.length()-1;i++)
		{
			  char ch =s.charAt(i);
			if(ch>='A' && ch<='Z' ||ch>='a' && ch<='z')
					{
				    
				AlphaCount++;
					
					}
			else if(ch>='0' && ch<='9')
			{
			     
				digitCount++;
				}
			
		}
		System.out.println(AlphaCount +"and" +digitCount);
		
	}

}
