package style_4_programming;
public  abstract class Shape
{
	protected static String color="Blue ";
	public void fill() {
		System.out.println(color+" Color");
	}
	abstract public void rotate() ;
	abstract public void findarea() ;
	
	

}
