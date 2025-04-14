package unBoxingProgramms;

public class Demo {
	public static void main(String[] args) {
		int a =10;
		Integer i=new Integer(a);
		int i1=i.intValue();
		System.out.println(i1);
		char ch ='a';
		Character c =new Character(ch);
		char ch1=c.charValue();//Explicit UnBoxing
		System.out.println(ch1);
		//Implicit
		
		double d =10.23;
		Double d1=d;//implicit Boxing
		double d2=d1;//implicit UnBoxing Jdk 1.5V
		System.out.println(d1);
		
	}

}
