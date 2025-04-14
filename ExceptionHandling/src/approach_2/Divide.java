package approach_2;

import java.util.Scanner;

public class Divide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main Starts");
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println("Enter the valid number");
			
			b=sc.nextInt();
			
			System.out.println(a/b);

		}
		
		
		System.out.println("Main End");
	
	}

}
