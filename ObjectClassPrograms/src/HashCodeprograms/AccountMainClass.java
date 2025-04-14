package HashCodeprograms;

import toStringMethodPrograms.Account;

public class AccountMainClass 
{
	public static void main(String[] args) {
		Account a1 = new Account("Nikki",9877,12354,100);
		a1.accountDetails();
		Account a2 = new Account("Nikki",9877,12354,100);
		System.out.println(a2);
		int uid =a1.hashCode();
		System.out.println(uid);
		int uid2 =a2.hashCode();
		System.out.println(uid2);
		
				
		
	}

}
