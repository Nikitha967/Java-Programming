package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee emp = new Employee("Ram",5,500);
		 try {
				FileOutputStream  fos= new FileOutputStream("A18//Employee.txt");
				try {
					ObjectOutputStream oss = new ObjectOutputStream(fos);
					oss.writeObject(emp);
					oss.flush();
					oss.close();
					System.out.println("Data Stored");
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
	}

}
