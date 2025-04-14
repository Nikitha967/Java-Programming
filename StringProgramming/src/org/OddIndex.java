package org;

public class OddIndex {
	public static void main(String[] args) {
		String s="I am a Indian";
		String [] s1 =s.split(" ");
		
		for(int i=0;i<=s1.length-1;i++) 
		{
			
				if(i%2==1) 
				{
				
					
					System.out.println(s1[i]);
				}
		}

	}

}
