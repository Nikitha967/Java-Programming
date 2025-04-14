package org;

public class sorting {
	public static void main(String[] args) 
	{
		String s ="jspiders";
		char [] ch =s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
			for(int j=i+1;j<=ch.length-1;j++)
			{
				if(ch[i]>ch[j]) 
				{
					char temp =ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println(ch[i]+"");
		}
}

	
}
	