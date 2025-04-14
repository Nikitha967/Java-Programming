package listprogramms;

import java.io.Serializable;

public class Student implements Serializable
{
	private String name;
	private int roolno;
	private int marks;
	private String gender;
	private String setion;
	
	public Student() {}

	public Student(String name, int roolno, int marks, String gender, String setion) {
		super();
		this.name = name;
		this.roolno = roolno;
		this.marks = marks;
		this.gender = gender;
		this.setion = setion;
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

	public int setMarks(int marks) {
		return this.marks = marks;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSetion() {
		return setion;
	}

	public void setSetion(String setion) {
		this.setion = setion;
	}

	@Override
	public String toString() {
		return "\n name=" + name + "\n roolno=" + roolno + "\n marks=" + marks + "\n gender=" + gender + "\n setion="
				+ setion + "]";
	}
	public void display() 
	{
		System.out.println("Student Name "+getName());
		System.out.println("Student Rollno "+getRoolno());
		System.out.println("Student Marks"+getMarks());
		System.out.println("Student Gender" +getGender());
		System.out.println("Student Section "+getSetion());
		System.out.println("------------------------------------------");
	}

	


}
