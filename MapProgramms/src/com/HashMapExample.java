package com;

import java.util.HashMap;

public class HashMapExample 
{
	public static void main(String[] args)
	{
		HashMap m = new HashMap();
		m.put(1, "Tom");
		m.put("Jsp", null);
		m.put(5, true);
		m.put(null, null);
		m.put(3.2,500);
		m.put(6, 10000);
		boolean res =m.containsKey(1);
		System.out.println(res);
		System.out.println("-----------------------------------");
		System.out.println(m.containsValue(500));
		System.out.println("-----------------------------------");
		System.out.println(m.keySet());
		System.out.println("-----------------------------------");
		System.out.println(m.values());
		System.out.println("-----------------------------------");
		System.out.println(m.entrySet());
		System.out.println("-----------------------------------");
		System.out.println(m.get(3.2));
		System.out.println("-----------------------------------");
		System.out.println(m.remove(5));
		System.out.println(m);
		System.out.println("-----------------------------------");
		System.out.println(m.remove(3.2, 500));
		System.out.println(m);
		System.out.println("-----------------------------------");
		System.out.println(m.replace("Jsp", 5));
		System.out.println(m);
		System.out.println("-----------------------------------");
		System.out.println(m.replace("Jsp", 5, "Qsp"));
		System.out.println(m);
		System.out.println("-----------------------------------");
		System.out.println(m.size());
		
		
		
	}

}
