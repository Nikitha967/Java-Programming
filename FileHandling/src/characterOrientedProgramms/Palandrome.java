package characterOrientedProgramms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Palandrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string");
String s=sc.next();
		
		String srev ="";
		
		for(int i=s.length()-1;i>=0;i--) 
		{
				
				char ch =s.charAt(i);
				srev = srev+ch;
			}
		if(s.equals(srev))
		{
		
		System.out.println("Palandrome");
		File f = new File("Palandrome.txt");
		try {
			System.out.println(f.createNewFile());
			FileWriter fr=new FileWriter(f,true);
			fr.write(srev);
			fr.flush();
			fr.close();
			System.out.println("Data Stored");

		} catch (IOException e) {
			
			System.out.println("Handled");
		}
		
		}
		else {
			System.out.println("NotPalandrome");
		}
		
		}
		
	}


