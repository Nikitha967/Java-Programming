package EqualstoPrograms;

import toStringMethodPrograms.Ticket;

public class TicketMainClass {

	public static void main(String[] args) {
		Ticket t1 = new Ticket (12, 34, "Blr", "Hyd", "10-03-2025");
		Ticket t2 = new Ticket (13, 35, "Hyd", "Chenni", "10-03-2025");
		Ticket t3 = new Ticket (14, 36, "Chenni", "Goa", "10-03-2025");
		Ticket t4 = new Ticket (15, 37, "Goa", "Kolk", "10-03-2025");
		t4.ticketDetails();
		System.out.println(t1);
		System.out.println(t2);
		boolean res =t1.equals(t2);
		System.out.println(res);
		boolean res1 =t1.equals(t3);
		System.out.println(res1);
		boolean res2 =t1.equals(t4);
		System.out.println(res2);
		
		
		
	}
}
