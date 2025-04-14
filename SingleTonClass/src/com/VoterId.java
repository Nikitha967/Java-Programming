package com;

import java.util.Random;

public class VoterId {
	private static VoterId v=null;
	public long voterIdNo;
	public String name;
	public int age;
	public char gender;
	public long mobileNo;
	
	//Create private  constructor
	Random r=new  Random();
	private VoterId (String name,int age, char gender) 
	{
		
		this.name=name;
		this.age=age;
		this.mobileNo=r.nextLong(123456789101l);
		this.gender=gender;
		this.voterIdNo=r.nextInt(123456);
		
		display();
		
	}
	//create public ststic helper metod
	public static VoterId createVoterIdObject()
	{
		if(v==null) {
			v=new VoterId("Nikki",21,'F');
			System.out.println("Voter Card created");
		}
		else 
			System.err.println("Voter Card Existing");	
		
		return v;
		
	}
	public void display() {
	
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("MobileNo: "+mobileNo);
		System.out.println("Gender: "+gender);
		System.out.println("VoterIdNo: "+voterIdNo);
	}
}
