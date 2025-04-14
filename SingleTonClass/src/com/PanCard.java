package com;

import java.util.Random;

public class PanCard {
	private static  PanCard v=null;
	public long panNo;
	public String name;
	public int age;
	public char gender;
	public long mobileNo;
	
	//Create private  constructor
	Random r=new  Random();
	private PanCard (String name,int age, char gender) 
	{
		
		this.name=name;
		this.age=age;
		this.mobileNo=r.nextLong(123456789101l);
		this.gender=gender;
		this.panNo=r.nextInt(123456);
		
		display();
		
	}
	//create public ststic helper metod
	public static PanCard createPanCardObject()
	{
		if(v==null) {
			v=new PanCard("Nikki",21,'F');
			System.out.println("Pan Card created");
		}
		else 
			System.err.println("Pan Card Existing");	
		
		return v;
		
	}
	public void display() {
	
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("MobileNo: "+mobileNo);
		System.out.println("Gender: "+gender);
		System.out.println("PanCardNo: "+panNo);
	}

}
