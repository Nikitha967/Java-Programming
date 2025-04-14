package listprogramms;


import java.util.ArrayList;

public class StringObject 
{
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("One");
	al.add("Two");
	al.add("Three");
	al.add("Four");
	al.add("Five");
	al.add("Six");
	for(int i=0;i<=al.size()-1;i++) 
	{
		
		//String s=(String)al.get(i);
		String s=al.get(i);
		System.out.println("First Chacter: "+s.charAt(0));
		System.out.println("Lenght of String at: "+i+" is "+s.length());
		System.out.println("--------------------------------------------------");
	}
}
}
