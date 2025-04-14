package style_4_programming;

public class TesteEngineer extends Employee
{

	private String testingType;
	public TesteEngineer(String testingType, int employeeId, String employeeName, int employeeSalary,
			int yearsOfExperence) {
		
		this.testingType = testingType;
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
		System.out.println("The assigned work is to do Testing");
	}
	

}
