package org;

public class SumDigitsPalindrome {
	public static void main(String[] args) {
        String s = "J123a45p";
        int sum = 0;

        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int value = ch - '0'; 
                sum = sum + value;
            }
        }

        System.out.println(sum);

        
        int temp = sum;
        int reverse = 0;
        int originalSum = sum;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (originalSum == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

}
