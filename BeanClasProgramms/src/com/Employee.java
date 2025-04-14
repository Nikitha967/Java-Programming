/*1.CREATE NON-ABSTRACT CLASS
2.CLSS SHOULD IMPLEMENT SERIALIZIBLE(I)
3.CREATE PRIVATE VARIABLES
4.CREATE PRIVATE NO-ARGUMENT CONSTRUCTOR
5.CREATE PUBLIC ARGUMENTS CONSTRUCTOR 
6.CREATE SETMETHOD() AND GET METHOD() FOR PRIVATE VARIABLE
 * */
package com;
import java.io.Serializable;
public class Employee  implements Serializable
{
	private String name;
	private int id;
	private int sal;
	public Employee() { }
	public Employee(String name, int id, int sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return id;
	}
	public void setsal(int sal) 
	{
		this.sal = sal;
	}
	public int getsal() 
	{
		return id;
	}
	
	public void display() 
	{
		System.out.println("Employee Name:"+getName());
		System.out.println("Employee Id:"+getId());
		System.out.println("Employee Salary:"+getsal());
		
	}
	
	
	
	

}
