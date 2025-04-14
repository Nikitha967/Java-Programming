package com.libarayProject;

import java.io.Serializable;

public class Book implements Serializable
{
	private String title;
	private String author;
	private int cost;
	private int noOfPages;
	private int bookId;
	
	public  Book() {}
	
	public Book(String title, String author, int cost, int noOfPages, int bookId) 
	{
		
		this.title = title;
		this.author = author;
		this.cost = cost;
		this.noOfPages = noOfPages;
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "\ntitle=" + title + "\n author=" + author + "\n cost=" + cost + "\n noOfPages=" + noOfPages
				+ "\n bookId=" + bookId + "";
	} 
	public void display() 
	{
		System.out.println("Book Title: "+getTitle());
		System.out.println("Book Author: "+getAuthor());
		System.out.println("Book Cost: "+getCost());
		System.out.println("Book No Of Pages: "+getNoOfPages());
		System.out.println("Book Book Id: "+getBookId());
		
	}
	
	
	

}
