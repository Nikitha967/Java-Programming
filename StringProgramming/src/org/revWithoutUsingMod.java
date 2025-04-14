package org;

public class revWithoutUsingMod {
	public static void main(String[] args) {
		String s = "123";
		String s1 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
		    char ch = s.charAt(i);
		    if (Character.isDigit(ch)) {
		        s1 = s1 + ch;
		    }
		}

		int num = Integer.parseInt(s1);
		System.out.println(num);

		
	}

}
