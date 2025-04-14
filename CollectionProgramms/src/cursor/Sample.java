package cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class Sample 
{
	public static void main(String[] args) {
ArrayList <Integer> al = new ArrayList<Integer>();
		
		al.add(12);
		al.add(18);
		al.add(23);
		
		ListIterator<Integer> ltr =al.listIterator();
		while(ltr.hasNext())
		{
			Integer i =ltr.next();
			if(i%2==0)
			{
				ltr.add(1);
			}
			
		}
		System.out.println(al);
		System.out.println("----------------------------------");
		while(ltr.hasPrevious())
		{
			
			Integer i =ltr.previous();
			if(i%2==1)
			{
				ltr.remove();
			}
		}
		System.out.println(al);
		System.out.println("----------------------------------");
		
		
	}

		
		
		
		
	}


