package style_4_programming;

public class Developer extends Employee
{
	
	private String languages;
	
	public Developer(int employeeId, String employeeName, int employeeSalary, int yearsOfExperence, String languages) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.yearsOfExperence = yearsOfExperence;
		this.languages = languages;
		
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
		System.out.println("The assigned work is to Develope Web Page");
	}
	

}
