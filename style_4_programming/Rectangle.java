package style_4_programming;

public class Rectangle extends Shape
{
	private int length;
	private int width;
	
	public Rectangle(int length, int width) 
	{
		
		this.length = length;
		this.width = width;
	}
	public Rectangle(int length, int width, String color) {
		
		this(length,width);
		this.color = color;
	}
	public void fill()
	{
		System.out.println(color+"color");
	}
	public void rotate()
	{
		System.out.println("clock wise");
	}
	public void findarea()
	{
		int area=length*width;
		System.out.println("Area: "+area);
	}
	
	

}
