package listprogramms;

import java.util.ArrayList;

public class StudentMainClass
{
	public static void main(String[] args) {

		Student s1 =new Student("Scott",20,78,"M","A") ;
		Student s2 =new Student("Nikitha",21,73,"F","B") ;
		Student s3 =new Student("Nidhi",23,69,"F","D") ;
		Student s4 =new Student("Ram",22,42,"M","C") ;
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		//for(int i=0;i<=al.size()-1;i++) 
		for(Student std:al)
		{
			
			//Student std = (Student) al.get(i);
		if(std.getGender().equalsIgnoreCase("F")&& std.getSetion().equalsIgnoreCase("B") )
		{
			
			System.out.println("Name: "+std.getName());
		}
		if(std.getMarks()>75 )
		{
			
			System.out.println("Name: "+std.getName());
			System.out.println("Rollno: "+std.getRoolno());
			System.out.println("Section: "+std.getSetion());
			
		}
		if(std.getName()=="Ram")
		{
		std.setMarks(78);
		}
		if(std.getMarks()<45 )
		{
			al.remove(std);
		}
		}
		//Student stu =(Student)al.get(0);
		Student stu =al.get(0);
		int marks =stu.getMarks();
		String name=stu.getName();
		//for(int i=0;i<=al.size()-1;i++)
		for(Student student:al)
		{
			//Student student =(Student)al.get(i);
			//Student student =al.get(i);
			if(student.getMarks()>marks)
			{
				marks=student.getMarks();
				name=student.getName();
				}
		
		}
		System.out.println("Name of Topper: "+name);
		System.out.print("Marks: "+marks);

		
		
		
	}
		

}
