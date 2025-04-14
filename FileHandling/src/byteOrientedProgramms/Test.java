package byteOrientedProgramms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Test 
{
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("A18//Jsp.txt");
			try {
				int len=fis.available();
				byte[]b=new byte[len];
				for(int i=0;i<=b.length-1;i++) {
				System.out.print((char)fis.read());}
			} catch (IOException e) {
				
				e.printStackTrace();
			}		} catch (FileNotFoundException e) {
		System.out.println("Handled");
		}
	}
	}
	
