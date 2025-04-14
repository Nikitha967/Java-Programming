package org;

import java.util.Arrays;

public class sortingOfToStrings {
	public static void anagram(String s1, String s2) 
	{
		
		if(s1.length()==s2.length())
			
		{
			String str1 =s1.toLowerCase();
			String str2 =s2.toLowerCase();
		
		
		
		
			char [] ch1 =str1.toCharArray();
			char [] ch2 =str2.toCharArray();
			//Arrays.sort(ch1);
			//Arrays.sort(ch2);
			for(int i=0;i<=str1.length()-1;i++)
			{
				for(int j=i+1;j<=ch1.length-1;j++)
				{
					if(ch1[i]>ch1[j]) 
					{
						char temp =ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp;
					}
				}
			}
			for(int i=0;i<=str2.length()-1;i++)
			{
				for(int j=i+1;j<=ch2.length-1;j++)
				{
					if(ch2[i]>ch2[j]) 
					{
						char temp =ch2[i];
						ch2[i]=ch2[j];
						ch2[j]=temp;
					}
				}
			}
			//System.out.println(Arrays.toString(ch1));
			//System.out.println(Arrays.toString(ch2));
			boolean res = Arrays.equals(ch1, ch2);
			if(res==true)
			{
			
				System.out.println("Is Analog");
		}
	
	
		else {
			System.out.println("Not Analog");
		}
		}
		
			
}
	public static void main(String[] args) {
		String s1="Care";
		String s2="Race";
		anagram(s1,s2);
		
	}
			
}



