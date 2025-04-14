package org;

public class Palandrome {
	public static void main(String[] args) {
		String s="dad";
		String srev ="";
		for(int i=s.length()-1;i>=0;i--) 
		{
				
				char ch =s.charAt(i);
				srev = srev+ch;
			}
		if(s.equals(srev))
		{
		
		System.out.println("Palandrome");
		}
		else {
			System.out.println(" not Palandrome" );
		}
		
		}

}
