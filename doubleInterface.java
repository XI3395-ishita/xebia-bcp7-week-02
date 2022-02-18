import java.io.*;
interface Book{
	void BookName();
}

interface Author extends Book{
	void AuthorName();
}


public class doubleInterface implements Book, Author {
	
	public void BookName() {
		System.out.println("Book: Java Language");
	}
	
	public void AuthorName() {
		System.out.println("Author: James Gosling");
	}

	public static void main(String[] args) {
		Book a=new doubleInterface();
		Author b=new doubleInterface();
		
		a.BookName();
		b.AuthorName();
		

	}

}
