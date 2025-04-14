package com;

public class MainClass1 
{
	public static void main(String[] args) {
		Runnable d = new Demo1();
		Thread t = new Thread(d);
		t.start();
		
	}

}
