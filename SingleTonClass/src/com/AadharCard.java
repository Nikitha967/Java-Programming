package com;

public class AadharCard {
	private static AadharCard n=null;
	public long aadharNo;
	public String name;
	public int age;
	public String address;
	public char gender;
	//Create private  constructor
	private AadharCard(long aadharNo,String name,int age,String address, char gender) 
	{
		this.aadharNo=aadharNo;
		this.name=name;
		this.age=age;
		this.address=address;
		this.gender=gender;
		display();
		
	}
	//create public ststic helper metod
	public static void createAadharObject()
	{
		if(n==null) 
		{
			n=new AadharCard(999923455,"Scott",23,"Hyd",'M');
			System.out.println("Aadhar Card created");
		}
		else {
			System.err.println("Aadhar Card Existing");	
		}
		
	}
	public void display() {
		System.out.println("AadharNo: "+aadharNo);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
		System.out.println("Gender: "+gender);
	}
	

}
