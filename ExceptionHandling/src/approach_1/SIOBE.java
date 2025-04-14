package approach_1;
import java.util.Scanner;
public class SIOBE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="Java";
		System.out.println("Main Starts");
		System.out.println("Enter the  index to get the vallue");
		int index=sc.nextInt();
		System.out.println(s.charAt(index));
		System.out.println("Main Ends");
	}

}
