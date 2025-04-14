package com;

public class ATB extends Thread
{
	@Override
	public void run()
	{
		try {
			Thread.sleep(4000);
			String s ="All the Best";

			for(int i=0;i<=s.length()-1;i++)
			{
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					
					System.out.println("Handled");
				}
				System.out.print(s.charAt(i));
			}
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	

	}

}
