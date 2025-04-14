package syle3_programming;

public class Chair
{
	private static String Matrial = "Wood";
	private  String type;
	public Chair(String type)
	{
		if(type.equals("Office Chair")|| type.equals("Dinning Chair") || type.equals(" Recliner Chair") )
			{
		 this.type = type;
			}
			else
				{
				System.err.println("Invalid chair type.............");
				
				}
	}
	public void ChairDetails()
	{
	
		System.out.println("*************************************************************");
		System.out.println("The Chair is made of  "+Matrial+" Matrial and is an  "+type);
		System.out.println("*************************************************************");
			


}
}

