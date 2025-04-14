package byteOrientedProgramms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Summation 
{
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("A18//Qsp.txt");
		try {
				int len=fis.available();
				byte[]b=new byte[len];
				String s=null;
				int num=0;
				int sum=0;
				for(int i=0;i<=b.length-1;i++)
				{
					char ch=(char)fis.read();
					s=ch+"";
					num=Integer.parseInt(s);
					sum=sum+num;
					}
				System.out.println(sum);
				
			}
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
	

