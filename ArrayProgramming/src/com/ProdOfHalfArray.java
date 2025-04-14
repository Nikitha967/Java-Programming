package com;

public class ProdOfHalfArray {
	public static void main(String[] args) {
		int [] a = {2,8,6,7};
		int prod = 1;
		for(int i=0;i<=(a.length-1)/2;i++)
		{
		prod = prod*a[i];	
		}
		System.out.println(prod);
		
	}

}
