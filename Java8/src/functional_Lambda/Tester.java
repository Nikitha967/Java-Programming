package functional_Lambda;

public class Tester implements Employee
{

	@Override
	public void login() {
		System.out.println("Login :10AM");
	}

	@Override
	public void work() {
		System.out.println("Testing Applications");
		
	}

	@Override
	public void sal() {
		System.out.println("40K P/M");
	}

	@Override
	public void logout() {
		System.out.println("Logout :6PM");
	}
}
