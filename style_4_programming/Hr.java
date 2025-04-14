package style_4_programming;

public class Hr extends Employee
{

	private String hrMode;
	
	public Hr(String hrMode, int employeeId, String employeeName, int employeeSalary, int yearsOfExperence) {
		super();
		this.hrMode = hrMode;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.yearsOfExperence = yearsOfExperence;
	}
	@Override
	public void yearlySalary()
	{
		long yearSal=employeeSalary*12l;
		System.out.println("Yearly Employee  Salary is: "+yearSal);
	}
	@Override
	public void displayDetails()
	{
	
		displayDetails();
	}
	
	@Override
	public void assignedWork()
	{
		System.out.println("The assigned work for Human Resource");
	}

}
