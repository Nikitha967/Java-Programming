package org;
public class UppercaseStringMethod {

   
    public static String uppercase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += ch; 
            }
        }
        return result;
    }

    public static void isEmpty(String s) {
        if (s.isEmpty()) { 
            System.out.println("String is empty");
        }
    }

    public static void main(String[] args) {
        String s = "IndiA";
        
      
        System.out.println("Uppercase Letters: " + uppercase(s));
        
        isEmpty(s);
    }
}

