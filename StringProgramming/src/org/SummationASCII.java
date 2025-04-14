package org;

public class SummationASCII {
	public static void main(String[] args) {
		String s="ABCD";
		int sum =0;
		for(int i=1;i<=s.length()-1;i++) 
		{
				
				char ch =s.charAt(i);
				sum = sum  +ch;
			}
		System.out.println(sum);
		
			
		
				
			
		
		
	}
	

}
