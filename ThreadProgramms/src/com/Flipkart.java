package com;

public class Flipkart
{
	synchronized public void paymentWay(String mode)
	{
		System.out.println("The Payment is in process by using "+mode);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The Payment Is done by using "+mode);
		System.out.println("------------------------------------------");
		
	}

}
