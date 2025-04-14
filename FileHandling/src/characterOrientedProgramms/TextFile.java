package characterOrientedProgramms;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class TextFile extends FileClass
{
	public TextFile(String data) {
		super(data);
	}

	@Override
public void writeData()
{
		File f = new File("textFile.txt");
		try {
			System.out.println(f.createNewFile());
			FileWriter fr=new FileWriter(f);
			fr.write(data);
			fr.flush();
			fr.close();
			System.out.println("Data Stored");
			
		} catch (IOException e) {
			System.out.println("Handled");
		}
		
}
	public void readData()
	{
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("textFile.txt"));
			try {
				String data =br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
