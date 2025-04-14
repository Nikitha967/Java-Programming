package approach_1;


public class ExceptionHandlingMetods {
	
	public static void main(String[] args) {
		try {
			System.out.println(2+5);
			System.out.println(2/0);
			System.out.println(2+5);
		}
		catch(ArithmeticException e)
		
		{
			System.out.println("handled");
		}
		
		
	}
	
}