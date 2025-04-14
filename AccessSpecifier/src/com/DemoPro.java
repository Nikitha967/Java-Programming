package com;

public class DemoPro{
	 protected int x=10;
	 
	 protected void run() 
	{
		System.out.println(x);
	}
	 public static void main(String[] args) {
		 DemoPro d = new DemoPro();
		System.out.println(d.x);
		d.run();
	}

}
