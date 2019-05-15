package linkedlistandArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import linkedlistandArraylist.Author;
public class AuthorMainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Author myauthor = new Author();
		Book b1 = new Book("XYZ",1,"Dr.Seuss");
		Book b2 = new Book("XYZ",2,"Intro to Java");
		Book b3 = new Book("XYZ",3,"Intro to Javascript");
		Book b4 = new Book("XYZ",4,"Angular JS");
		
		ArrayList<Book> l1 = new ArrayList<Book>();
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		
		Author a1 = new Author(1,"James",Arrays.asList(b2,b3));
		Author a2 = new Author(2,"Williams",Arrays.asList(b3,b4));
		Author a3 = new Author(3,"Charles",Arrays.asList(b1,b4));
		
		ArrayList<Author> authorlist = new ArrayList<Author>(Arrays.asList(a1,a2,a3));
		
		for(Author a: authorlist) {
			System.out.println(a.authorName);
		}
		
		for(Book b: l1) {
			System.out.println(b.bookname);
		}
		
		
		
		
	}

}
