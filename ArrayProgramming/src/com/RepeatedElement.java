package com;

public class RepeatedElement {
	public static void main(String[] args)
	{
		int []a= {1,2,3,1,2,4,5};
		int count=1;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j]) 
				{
					count++;
				}
				
				
			}
		}

}
}
