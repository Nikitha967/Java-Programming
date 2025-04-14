package HashCodeprograms;

public class BallonsMainClass 
{
	public static void main(String[] args) 
	{
		Ballon b1 = new Ballon("white");
		Ballon b2 = new Ballon("blue");
		Ballon b3 = new Ballon("gold");
		Ballon b4 = new Ballon("red");
		

		
		b1.BallonDetails();
		
		
		b2.BallonDetails();
		
	
		b3.BallonDetails();
		
		
		b4.BallonDetails();
		int uid =b1.hashCode();
		System.out.println(uid);
		int uid2 =b2.hashCode();
		System.out.println(uid2);
		int uid3 =b3.hashCode();
		System.out.println(uid3);
		int uid4 =b4.hashCode();
		System.out.println(uid4);
	
		

	
		

	}
}
