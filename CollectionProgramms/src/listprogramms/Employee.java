package listprogramms;

import java.io.Serializable;

public class Employee implements Serializable 
{
	private String name;
	private int id;
	private int sal;
	private String designation;
	private String location;
	
	public Employee() {}

	public Employee(String name, int id, int sal, String designation, String location) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.designation = designation;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public void display() 
	{
		System.out.println("Employee Name "+getName());
		System.out.println("Employee Salary "+getSal());
		System.out.println("Employee Id "+getId());
		System.out.println("Employee Location "+getLocation());
		System.out.println("Employee Designation "+getDesignation());
		System.out.println("------------------------------------------");
	}

	@Override
	public String toString() {
		return "/n name=" + name + "\n id=" + id + "\n sal=" + sal + "\n designation=" + designation + "\n location="
				+ location + "]";
	}
	
	
}

	
