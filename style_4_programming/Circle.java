package style_4_programming;

public class Circle  extends Shape
{
	private final static double pi=3.14;
	private int r;
	
	
	public Circle(int r) {
		
		this.r = r;
	}
	
	public Circle(int r, String color) {
		
		this(r);
		this.color = color;
	}

	public void fill()
	{
		System.out.println(color+"color");
	}
	public void rotate()
	{
		System.out.println(" anti clock wise");
	}
	public void findarea()
	{
		double area=pi*r*r;
		System.out.println("Area: "+area);
	}
	

}
