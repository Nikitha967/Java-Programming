package characterOrientedProgramms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample1 {
	public static void main(String[] args) {
		File f = new File("ABC.txt");
		try {
			System.out.println(f.createNewFile());
			FileWriter fr=new FileWriter(f,true);
			fr.write(" ||ABCD");
			fr.flush();
			fr.close();
			System.out.println("Data Stored");
			
		} catch (IOException e) {
			System.out.println("Handled");
		}
	}

}
