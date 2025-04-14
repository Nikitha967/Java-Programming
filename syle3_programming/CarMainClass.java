package syle3_programming;

import style2_programming.Car;

public class CarMainClass {
	public static void main(String[] args)
	{
		//object creation 
		Car firstCar=new Car();
		firstCar.provideCarDetails("Fortuner" , "TN-XX-9999",300000,"Petrol", 20);
		firstCar.viewCarDetails();
		Car secondCar=new Car();
		secondCar.provideCarDetails("maruthi" , "TN-XX-9949",3354600,"Electric", 120);
		secondCar.viewCarDetails();
	}

}