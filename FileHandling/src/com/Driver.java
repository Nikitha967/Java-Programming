package com;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Driver {
	public static void main(String[] args)
	{
		File f = new File("Ms18");
		try {
			System.out.println(f.mkdir());
			File f1 = new File("Ms18//Name.doc");
			FileWriter fw = new FileWriter(f1,true);
			fw.write("Nikitha");
			fw.write("Aparna");
			fw.flush();
			System.out.println("Data Stored");
			//FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(new FileReader(f1));
			boolean res=new File("Ms18//Name.doc").exists();
			System.out.println(res);
			if(res==true) {
				/*long length = new File("Ms18//Name.doc").length();
				for(int i=0;i<=length-1;i++)
				{
					System.out.print((char)fr.read());
				}*/
				String data =br.readLine();
				System.out.println(data);
				}
			else {
				throw new FileNotPresentException();
			}
			fw.close();

		}

		   
		catch( IOException e)
		{
			System.out.println("File not Found");
		}
	
		
	}

}
