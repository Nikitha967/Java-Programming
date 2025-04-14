package style_4_programming;

public abstract class Employee 
{
	protected int employeeId;
	protected  String employeeName;
	protected  int employeeSalary;
	protected int yearsOfExperence;
	
	abstract public void yearlySalary();
	abstract public void displayDetails();
	abstract public void assignedWork();

}
