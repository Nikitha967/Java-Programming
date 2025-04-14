package EqualstoPrograms;

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
		boolean res =b1.equals(b2);
		System.out.println(res);
		boolean res1 =b3.equals(b4);
		System.out.println(res1);
	
		

	
		

	}
}
