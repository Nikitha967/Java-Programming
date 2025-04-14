package functional_Lambda;

public class MainClass
{
	public static void main(String[] args) {
		
		Sample s =()->
		{
			System.out.println("Running");
		};
		s.run();
	}

}
