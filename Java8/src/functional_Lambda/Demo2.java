package functional_Lambda;

import java.util.function.Predicate;

public class Demo2 implements Predicate<Integer>
{

	@Override
	public boolean test(Integer i) {
		if(i%2==0)
		return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		boolean res = d.test(10);
		System.out.println(res);
	}
	
	

}
