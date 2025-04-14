package byteOrientedProgramms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo 
{
	public static void main(String[] args)  {
		//File f = new File("A18");
		//System.out.println(f.mkdir());
	try {
		FileOutputStream fos =new FileOutputStream("A18//Abc.txt",true);
		String s="ABC";
		byte[]b=s.getBytes();
		//System.out.println(Arrays.toString(b));
		try {
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("Data Stored");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		System.out.println("Handled");
	}
	
		
	}

}
