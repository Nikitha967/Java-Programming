package syle3_programming;

public class RectanglesMainClass 
{
	public static void main(String[] args) 
	{
		Rectangles r1 = new Rectangles();
		Rectangles r2 = new Rectangles();

		r1.l=8;
		r1.w=10;
		r2.l=22;
		r2.w=14;

		double area1 = r1.l*r1.w;
		double area2 =r2.l*r2.w;	

		
		double area1convert=area1/100;
		double area2convert=area2/100;

		System.out.println("______Rectangle1 Details_______");
		System.out.println(" Rectangle color is : "+Rectangles.color);
		System.out.println("Length value : "+r1.l+ "mm");
		System.out.println("Width value : "+r1.w+ "mm");
		System.out.println("area value : "+area1);
		System.out.println("area convert value : "+area1convert+"cm");
	
		System.out.println("______Rectangle2 Details_______");
		System.out.println(" Rectangle color is : "+Rectangles.color);
		System.out.println("Length value : "+r2.l+ "mm");
		System.out.println("Width value : "+r2.w+ "mm");
		System.out.println("area value : "+area2);
		System.out.println("area convert : "+area2convert+"cm");
		}
}
