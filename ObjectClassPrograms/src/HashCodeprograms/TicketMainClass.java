package HashCodeprograms;



public class TicketMainClass {

	public static void main(String[] args) {
		Ticket t1 = new Ticket (12, 34, "Blr", "Hyd", "10-03-2025");
		Ticket t2 = new Ticket (13, 35, "Hyd", "Chenni", "10-03-2025");
		Ticket t3 = new Ticket (14, 36, "Chenni", "Goa", "10-03-2025");
		Ticket t4 = new Ticket (15, 37, "Goa", "Kolk", "10-03-2025");
		t4.ticketDetails();
		System.out.println(t1);
		System.out.println(t2);
		int uid =t1.hashCode();
		System.out.println(uid);
		/*int uid2 =t2.hashCode();
		System.out.println(uid2);
		int uid3 =t3.hashCode();
		System.out.println(uid3);
		int uid4 =t4.hashCode();
		System.out.println(uid4);*/
		
		
		
	}
}
