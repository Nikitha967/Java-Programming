package com.libarayProject;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		Library l = new Library();
		boolean start=true;
		while(start=true) 
		{
			
			System.out.println("Enter You Choice \n 1.Add Book \n 2.Display Book\n 3.Search Book by Id \n 4.Search Book by Author \n 5.Update Cost\n 6.Remove Book\n 7.Exit");
			int ch=sc.nextInt();
			
			
			switch(ch)
			{
			case 1:
			{
				System.out.println(" Enter Book Title: ");
				String title =sc.next();
				System.out.println(" Enter Book Author: ");
				String author =sc.next();
				System.out.println(" Enter Book Cost: ");
				int cost =sc.nextInt();
				System.out.println("Enter Book No Of Pages: ");
				int pages =sc.nextInt();
				System.out.println("Enter Book Book Id: ");
				int id =sc.nextInt();
				l.addBook(new Book(title, author, cost, pages, id));
				
				
			}
			break;
			case 2:
			{
				l.displayBook();
				
				
			}
			break;
			case 3:
			{
				System.out.println("Enter Book  Id: ");
				int id =sc.nextInt();
				l.searchBook(id);
				
			}
			break;
			case 4:
			{
				System.out.println(" Enter Book Author: ");
				String author =sc.next();
				l.searchBook(author);
				
			}
			break;
			case 5:
			{
				System.out.println("Enter Book  Id: ");
				int id =sc.nextInt();
				System.out.println("Enter New Book Cost: ");
				int newcost =sc.nextInt();
				l.updateCost(id, newcost);
				
			}
			break;
			case 6:
			{
				System.out.println("Enter Book  Id: ");
				int bookid =sc.nextInt();
				l.removeBook(bookid);
				
			}
			break;
			case 7:
			{
				start=false;
				System.out.println("Thankyou For Visting");
			}
			break;
			default:
				System.out.println("You Entered Invalid Choice");
			}
			
			
		}
	}

}
