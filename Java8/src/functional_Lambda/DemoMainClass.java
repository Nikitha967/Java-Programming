package functional_Lambda;

public class DemoMainClass 
{
	public static void main(String[] args) {
		Demo d =(String s) ->
		{
			String rev="";
			for(int i=s.length()-1;i>=0;i--)
			{
				rev = rev+s.charAt(i);
			}
			if(s.equals(rev))
			System.out.println("Palandrome");
			else
				System.out.println("Not Palandrome");
			return s;
		};
		d.test("manam");
	}

}
