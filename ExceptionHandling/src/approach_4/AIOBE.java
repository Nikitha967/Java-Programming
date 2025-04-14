package approach_4;
import java.util.Scanner;
public class AIOBE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]= {1,9,3,6,8};
		System.out.println("Main Starts");
		System.out.println("Enter the  index to get the vallue");
		int index=sc.nextInt();
		while(true) 
		{
			try {
				System.out.println(a[index]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Enter the valid number");
				
				index=sc.nextInt();
				
				
				

			}
			System.out.println("Main Ends");
	
		}
		
	}

}
