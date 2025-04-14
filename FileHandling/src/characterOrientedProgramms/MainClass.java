package characterOrientedProgramms;

public class MainClass 
{
	public static void insertData(FileClass f) {
	
		f.writeData();
		f.readData();
	}
	public static void main(String[] args) {
		insertData(new TextFile("Java"));
	}

}
