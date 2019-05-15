package linkedlistandArraylist;

import java.util.List;
import linkedlistandArraylist.Book;


public class Author {

	 int authorid;
	 String authorName;
	 List<Book> authorBooks ;
	
	Author(int authorid, String authorName, List<Book> authorBooks){
		this.authorid = authorid;
		this.authorName = authorName;
		this.authorBooks = authorBooks;
	}
	
	public static void printAuthor(String authorname,List<Author> authorlist) {
		System.out.println("inside the method");
		System.out.println("authorname:"+authorname);
		
		for (int i = 0;i<authorlist.size();i++) {
			System.out.println("ID:"+authorlist.get(i).authorid);
			System.out.println("Name:"+authorlist.get(i).authorName);
			for (int j = 0;j<authorlist.get(i).authorBooks.size();j++) {
				System.out.println("Book details:"+authorlist.get(i).authorBooks);
			}
		}
		
		for(int i = 0;i<authorlist.size();i++) {
			System.out.println(authorlist.get(i).authorName);
			if (authorlist.get(i).authorName.equals(authorname)) {
				System.out.println("AuthorId:"+authorid);
				System.out.println("Author Name:"+authorName);
				System.out.println("List of Books:");
				for(Book b: authorBooks) {
					System.out.println(b.bookid);
					System.out.println(b.isbn);
					System.out.println(b.bookname);
				}
			}
		}
	}
	
}
	
	
	/*void addBook(String bookname,List<Book> booklist) {
		boolean flag = true;
		Book book;
		for (int i= 0;i<authorBooks.size();i++) {
			if (authorBooks.get(i).bookname.equals(bookname)){
				flag = false;
			}
		}
		if (flag == true) {
			for (int j=0;j<booklist.size();j++) {
				if(booklist.get(j).bookname.equals(bookname)) {
					authorBooks.add(booklist.get(j));
					System.out.println("Added successfully");
					break;
				}
			}
			
			
		}
		
	}
	
	void removeBook(String bookname) {
		boolean flag = false;
		Book book;
		
		for (int i = 0;i<authorBooks.size();i++) {
			if (authorBooks.get(i).bookname.equals(bookname)) {
				authorBooks.remove(authorBooks.get(i));
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("The book is deleted successfully");
		}
		
	}
}*/
