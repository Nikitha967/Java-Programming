package cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class LtrExample2
{
	public static void main(String[] args)
	{
		
		ArrayList <String> al = new ArrayList<String>();
		
		al.add("Java");
		al.add("Html");
		al.add("Css");
		al.add("Python");
		al.add("Sql");
		ListIterator<String> ltr =al.listIterator();
		while(ltr.hasNext())
		{
			int index=ltr.nextIndex();
			String i =ltr.next();
			System.out.println(index+"->"+i);
		}
		System.out.println("--------------------------------");
		while(ltr.hasPrevious())
		{
			int index=ltr.previousIndex();
			String i =ltr.previous();
			System.out.println(index+"->"+i);
		}
		
		
	}

}
