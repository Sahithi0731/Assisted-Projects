package collections;
import java.io.*;
import java.util.*;
class Book {
	public String title;
	public String author;
	Book(String title, String author){
	this.title=title;
	this.author=author;
	}

}
class Library{
	private final List<Book>Books;
	Library(List<Book>Books){
		this.Books=Books;
	}
	public List<Book>getTotalBooksInLibrary(){
		return Books;
	}
}
public class composition{
	public static void main(String[] args) {
		Book b1=new Book("EffectiveJ Java","Joshua Bloch");
		Book b2 = new Book("thinking in java","bruce eckel");
		Book b3=new Book("java:the complete reference","herbet schildt");
		
		List<Book>Books = new ArrayList<Book>();
		Books.add(b1);
		Books.add(b2);
		Books.add(b3);
		
		Library library = new Library(Books);
		
		List<Book>bks=library.getTotalBooksInLibrary();
		for(Book bk:bks) {
			System.out.println("Title:"+bk.title+"and"+"Author:"+bk.author);
		}
	}
}
