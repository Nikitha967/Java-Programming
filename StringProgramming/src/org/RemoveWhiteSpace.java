package org;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String s ="Ja va";
		String s1 ="";
		 for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if (Character.isAlphabetic(ch)) 
	            {
	            	
	               s1=s1+ch;
	            }
	           
	}
		 System.out.println(s1);
	}

}
