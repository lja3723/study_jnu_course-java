package chapter04_1.classes;

public class Book {
	public String title;
	public String author;
	
	public Book(String title) {
		this(title, "작자미상");
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
