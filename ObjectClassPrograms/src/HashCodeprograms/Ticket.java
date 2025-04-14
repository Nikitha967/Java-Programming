 package HashCodeprograms;

public class Ticket {
	public int ticketno;
	public int seatno;
	public String bordingpoint;
	public String destinationpoint;
	public String journeydate;
	
	public Ticket (int ticketno,int seatno,String bordingpoint,String destinationpoint,String journeydate) 
	{
		
		this.ticketno=ticketno;
		this.seatno=seatno;
		this.bordingpoint=bordingpoint;
		this.destinationpoint=destinationpoint;
		this.journeydate=journeydate;
		
	}
	
	@Override
	public String toString() {
		return "ticketno: "+ticketno+"\n"+"bordingpoint"+bordingpoint+"\n"+"seatno"+seatno;
	}
	
	public void ticketDetails() {
		System.out.println("ticketno: "+ticketno);
		System.out.println("seatno: "+seatno);
		System.out.println("bordingpoint: "+bordingpoint);
		System.out.println("destinationpoint: "+destinationpoint);
		System.out.println("journeydate: "+journeydate);

	}


}
