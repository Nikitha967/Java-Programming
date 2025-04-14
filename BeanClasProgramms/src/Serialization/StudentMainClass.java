package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentMainClass 
{
	public static void main(String[] args) {
		Student s = new Student("Scott",77,8);
		 try {
			FileOutputStream  fos= new FileOutputStream("A18//Student.txt");
			try {
				ObjectOutputStream oss = new ObjectOutputStream(fos);
				oss.writeObject(s);
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
