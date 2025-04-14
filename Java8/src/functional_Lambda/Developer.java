package functional_Lambda;

public class Developer implements Employee
{

	@Override
	public void login() {
		System.out.println("Login :9AM");
	}

	@Override
	public void work() {
		System.out.println("Developing Applications");
		
	}

	@Override
	public void sal() {
		System.out.println("50K P/M");
	}

	@Override
	public void logout() {
		System.out.println("Logout :7PM");
	}
	@Override
	public void bonus() {
		System.out.println("Bonus:10k");
	}
	

}
