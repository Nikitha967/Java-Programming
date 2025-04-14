package org;

public class UpperCase
{
	public static void main(String[]arg) {
		
		String s="IndiA";
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
					if(ch>='A' && ch<='Z') {
						System.out.println(ch);
					}
		}
	}
	
}
