package com;
import java.util.Scanner;
public class UiDetails {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    boolean start = false;
		while(start == false)
		{
			System.out.println("Enter your choice");
			System.out.println("1-To AadharCard;  ");
			System.out.println("2-To VoterId ;  ");
			System.out.println("3-To PanCard;  ");
			System.out.println("4-Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					AadharCard.createAadharObject();
					break;
					case 2:
						VoterId.createVoterIdObject();
					break;
					case 3:
	
						PanCard.createPanCardObject();
					break;
					case 4:
						System.out.println("Thank You...............");
					start =  true;
					break;
					default:
						System.out.println("Enter valid choice");

			}

		}

		System.out.println("You Hve exited the application");
		
	}

}
