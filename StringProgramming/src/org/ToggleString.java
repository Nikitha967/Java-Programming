package org;

public class ToggleString {
	public static void main(String[] args) {
		String s ="InDia";
		for(int i=0;i<=s.length()-1;i++)
		{ 
			char ch = s.charAt(i);
		if(Character.isUpperCase(ch))
		System.out.println(Character.toLowerCase(ch));
	    else 
	System.out.println(Character.toUpperCase(ch));
		
		}
		
	}
	
	
			
	

}
