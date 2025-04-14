package EqualstoPrograms;

import toStringMethodPrograms.Account;

public class AccountMainClass 
{
	public static void main(String[] args) {
		Account a1 = new Account("Nikki",9877,12354,100);
		a1.accountDetails();
		Account a2 = new Account("Nikki",9877,12354,100);
		System.out.println(a2);
		boolean res =a1.equals(a2);
		System.out.println(res);
		
				
		
	}

}
