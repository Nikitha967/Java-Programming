package style_4_programming;
import java.util.Scanner;
public class EmployeeMainClass 
{
	private static Scanner sc= new Scanner(System.in);
	private static Employee employee;
	public static void main(String[] args) {
		int status=0;
		do
		{
			System.out.println("Press 1 Of Developers Information ......");
			System.out.println("Press 2 Of Teste Engineers Information ......");
			System.out.println("Press 3 Of HR Information ......");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:gatherDevelopersData();
			break;
			case 2:gatherTesteEngineersData();
			break;
			case 3:gatherHRData();
			break;
			}
			status=1;
						try
			{
				employee.yearlySalary();
				employee.displayDetails();
				employee.assignedWork();
				
			}
			catch(NullPointerException e)
			{
				System.out.println("Enter valid shape");
				status=0;

			}
			
		}
		while(status==0);
	}
			
		
		
	
public static void gatherDevelopersData() 
{
	
	System.out.println("Enter  Employee Id");
	System.out.println("Enter Employee Name ");
	System.out.println("Enter Employee Salary");
	System.out.println("Enter Years Of Experience");
	int id=sc.nextInt();
	  String name=sc.next();
	  int salary=sc.nextInt();
	 int years=sc.nextInt();
	
	
	

		employee=(Employee) new Developer();
	

}
public static  void gatherTesteEngineersData() 
{System.out.println("Enter Testing TYPE");
int testtype = sc.nextInt();
	System.out.println("Enter 1 for Manul Testing");
	System.out.println("Enter 2 for Autoimation Testing");
	
	
	int option = sc.nextInt();
	if(option==1)
	{
	employee=(Employee) new TesteEngineer(testtype);
	}
	else {
		employee=(Employee) new TesteEngineer(testtype);
	}

}
public static void gatherHRData() 
{
	System.out.println("Enter 1 for Triangle without color");
	System.out.println("Enter 2 for Triangle with color");
	System.out.println("Enter Base");
	System.out.println("Enter Height");
	int b = sc.nextInt();
	int h = sc.nextInt();
	int option = sc.nextInt();
	if(option==1)
	{
		employee=(Employee) new Triangle(b,h);
	}
	else {
		System.out.println("Enter the color");
		String color = sc.next();
		employee=(Employee) new Triangle(b,h,color);
	}
		
}
	

}
