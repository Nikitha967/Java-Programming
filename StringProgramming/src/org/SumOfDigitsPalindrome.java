package org;

public class SumOfDigitsPalindrome {
	public static void main(String[] args) {
        String s = "J123a45p";
       String s1 ="";

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) 
            {
                s1=s1+ch;
                
            }
        }

   int num =Integer.parseInt(s1);
        int sum = 0;
        int temp=num;
        

        while (temp != 0) 
        {
            int digit = temp % 10;
            sum+=digit;
            temp = temp / 10;
        }
        System.out.println(sum);
        int rev=0;
        int sumtemp=sum;
        while(sumtemp!=0){
        	int digit = sumtemp % 10;
            rev=rev*10+digit;
            sumtemp = sumtemp / 10;
        }
        System.out.println(rev);
        if (sum == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        

       
        
	}
}




