package byteOrientedProgramms;               

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EvenNumbers 
{
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("A18//Sql.txt");
			try {
				int len=fis.available();
				byte[]b=new byte[len];
				String s=null;
				int num=0;
				
				for(int i=0;i<=b.length-1;i++)
				{
					char ch=(char)fis.read();
					s=ch+"";
					num=Integer.parseInt(s);
					if(num%2==0) 
					{
						System.out.println(num);
					}
					}}
			catch (IOException e) 
			{
			e.printStackTrace();
			}		
			} 
		catch (FileNotFoundException e) {
		System.out.println("Handled");
		}
	}
	}
	

  