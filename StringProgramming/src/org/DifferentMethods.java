package org;

public class DifferentMethods {
	public static void main(String[] args) {
		//trim
		//String myStr = "       Hello World!        ";
	    //System.out.println(myStr.trim());
	    //isEmpty
	    //String myStr1 = "Hello";
	    //String myStr2 = "";
	    //System.out.println(myStr1.isEmpty());
	    //System.out.println(myStr2.isEmpty());
		//isBlank
		//String s1 = "   ";    
       // String s2 = "Hello, World!";
        //String s3 = "\t";
        //System.out.println(s1.isBlank());
       // System.out.println(s2.isBlank());  
        //System.out.println(s3.isBlank());
		//codePointAt
		//String myStr3 = "Hello";
		//int result = myStr3.codePointAt(0);
		//System.out.println(result);
		//toCharArray
		//String s = "Java";
		//char[] ca = s.toCharArray();
		//System.out.println(ca);
		//String to int
		//String age = "21";
		//int age_to_int = Integer.parseInt(age);
		//System.out.println(age_to_int + 1);
		// int to String
		int a = 1234; 
        int b = -1234; 
  
        // Converting integer to string 
        // using toString() method 
        String str1 = Integer.toString(a); 
        String str2 = Integer.toString(b); 
  
        
        System.out.println("String str1 = " + str1); 
        System.out.println("String str2 = " + str2);
     // Concatenating with empty strings 
        String str3 = "" + a; 
        String str4 = "" + b; 
  
        // Printing the concatenated strings 
        System.out.println("String str3 = " + str3); 
        System.out.println("String str4 = " + str4);
        
		
		
        

		
	}
	
}
