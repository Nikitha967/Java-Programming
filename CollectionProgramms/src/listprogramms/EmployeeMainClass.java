package listprogramms;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMainClass
{
	public static void main(String[] args) {

		Employee emp1 =new Employee("Scott",5,80000,"JavaDeveloper","Hyd") ;
		Employee emp2 =new Employee("Ram",6,30000,"Tester","Blg") ;
		Employee emp3 =new Employee("Tom",7,40000,"Clerk","Chenni") ;
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		for(Employee e:al) 
		{
			//Object emp = al.get(i);
			//Employee e = (Employee) emp;
			//Employee e =  al.get(i);
		if(e.getDesignation().equalsIgnoreCase("JavaDeveloper")) 
		{
			System.out.println("Name: "+e.getName());
			System.out.println("Location: "+e.getLocation());
			
		}	
		}
		System.out.println("-----------------------------------------");
		/*for(Employee emp:al) 
		 
		{
			
			//Employee emp = (Employee) al.get(i);
			//Employee emp =  al.get(i);
	if(emp.getSal()>50000) 
		{
			
			emp.display();
		}	
		
			
		}*/
		List<Employee>li=al.stream().filter((e)->e.getSal()>45000).collect(Collectors.toList());
		System.out.println(li);
		
		
	}
	
	
	
	

}
