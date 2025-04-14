package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private transient int roolno;
	private int marks;
	public Student(){}
	
	
	public Student(String name, int roolno, int marks) {
		super();
		this.name = name;
		this.roolno = roolno;
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoolno() {
		return roolno;
	}


	public void setRoolno(int roolno) {
		this.roolno = roolno;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public void display() 
	{
		System.out.println("Student Name:"+getName());
		System.out.println("Student Id:"+getRoolno());
		System.out.println("Student Salary:"+getMarks());
		
		
	}
	
	

}
