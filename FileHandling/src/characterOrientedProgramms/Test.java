package characterOrientedProgramms;

import java.io.File;
import java.io.IOException;

public class Test {
public static void main(String[] args) {
	File f = new File("Jsp.doc");
	try {
		boolean res =f.createNewFile();
		System.out.println(res);
	} catch (IOException e) {
		System.out.println("handled");
	}
	
}

}

