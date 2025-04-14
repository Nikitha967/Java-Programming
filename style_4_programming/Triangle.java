package style_4_programming;

public class Triangle extends Shape
{
	private int breath;
private int height;


public Triangle(int breath, int height) {
	super();
	this.breath = breath;
	this.height = height;
}

public Triangle(int breath, int height, String color) {
	//validation later
	this(breath,height);
	this.color = color;
}
public void fill()
{
	System.out.println(color+"color");
}
public void rotate()
{
	System.out.println("clock wise-anti clock wise");
}
public void findarea()
{
	double area=0.5*breath*height;
	System.out.println("Area: "+area);
}


}
