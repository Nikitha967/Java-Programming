package cursor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample 
{
	public static void main(String[] args)
	{
		
		ArrayList <String> al = new ArrayList<String>();
		//List l=Arrays.asList("Java","css","Html");
		al.add("Hi");
		al.add("css");
		al.add("Html");
		al.add("Jsp");
		al.add("Server");
		Iterator<String> itr =al.iterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			if(s.length()>3)
			{
				itr.remove();
				
			}
			
			
			}
		System.out.println(al);
	}

}
