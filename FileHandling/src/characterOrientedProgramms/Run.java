package characterOrientedProgramms;

import java.io.File;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		File f = new File("Jsp.pdf");
		try {
			boolean res =f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}

