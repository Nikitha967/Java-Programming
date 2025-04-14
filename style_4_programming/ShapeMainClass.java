package style_4_programming;

import java.util.Scanner;

public class ShapeMainClass 
{
	private static Scanner sc= new Scanner(System.in);
	private static Shape shape;
	public static void main(String[] args) {
		int status=0;
		do
		{
			System.out.println("Press 1 Of Rectangle Fuctionality ......");
			System.out.println("Press 2 Of Circle Fuctionality ......");
			System.out.println("Press 3 Of Triangle Fuctionality ......");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:gatherRectangleData();
			break;
			case 2:gatherCircleData();
			break;
			case 3:gatherTriangleData();
			break;
			}
			status=1;
						try
			{
				shape.fill();
				shape.findarea();
				shape.rotate();
			}
			catch(NullPointerException e)
			{
				System.out.println("Enter valid shape");
				status=0;

			}
			
		}
		while(status==0);
	}
			
		
		
	
public static void gatherRectangleData() 
{
	
	System.out.println("Enter 1 for Rectangle without color");
	System.out.println("Enter 2 for Rectangle with color");
	System.out.println("Enter length");
	System.out.println("Enter width");
	int l = sc.nextInt();
	int w = sc.nextInt();
	int option = sc.nextInt();
	if(option==1)
	{
		shape=(Shape) new Rectangle(l,w);
	}
	else {
		System.out.println("Enter the color");
		String color = sc.next();
		shape=(Shape) new Rectangle(l,w,color);
	}

}
public static  void gatherCircleData() 
{
	System.out.println("Enter 1 for Circle without color");
	System.out.println("Enter 2 for Circle with color");
	System.out.println("Enter Radius");
	
	int r = sc.nextInt();
	int option = sc.nextInt();
	if(option==1)
	{
		shape=(Shape) new Circle(r);
	}
	else {
		System.out.println("Enter the color");
		String color = sc.next();
		shape=(Shape) new Circle(r,color);
	}

}
public static void gatherTriangleData() 
{
	System.out.println("Enter 1 for Triangle without color");
	System.out.println("Enter 2 for Triangle with color");
	System.out.println("Enter Base");
	System.out.println("Enter Height");
	int b = sc.nextInt();
	int h = sc.nextInt();
	int option = sc.nextInt();
	if(option==1)
	{
		shape=(Shape) new Triangle(b,h);
	}
	else {
		System.out.println("Enter the color");
		String color = sc.next();
		shape=(Shape) new Triangle(b,h,color);
	}
		
}
	
	

}
