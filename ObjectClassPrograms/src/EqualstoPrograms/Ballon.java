package EqualstoPrograms;

public class Ballon
{
	private static String gasType = "helium";
	private  String color;
	public Ballon(String z)
	{
		if(z.equals("white")|| z.equals("blue") || z.equals("gold") || z.equals("sliver") ||z.equals("red"))
			{
			color = z;
			}
			else
				{
				System.err.println("Give color is invalid");
				
				}
	}
	@Override
	public String toString() {
		return "color : "+color;
	}
	public void BallonDetails()
	{
		
		System.out.println( color+" color ballon is filled with " +gasType +" gas");
			


}
}

