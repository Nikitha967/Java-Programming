package com;

public class MainClass2

{
	public static void main(String[] args) {
		Trainer t = new Trainer();
		Student s = new Student("Shella",t);
		Student s1 = new Student("Malla",t);
		Student s2 = new Student("Laila",t);
		s.start();
		s1.start();
		s2.start();

		
	}

}
