package functional_Lambda;

public class EmployeeMainClass
{
	public static void main(String[] args) {
		Developer d =new Developer();
		d.bonus();d.login();d.logout();d.sal();d.work();
		System.out.println("---------------------------------------");
		Tester t = new Tester();
		t.login();t.logout();t.sal();t.work();
	}

}
