

import java.util.List;


public class LibraryService {
	String libraryName;
	String address;
	List<Book> books;
	
	public LibraryService() {
		super();
	}

	public LibraryService(String libraryName, String address, List<Book> books) {
		super();
		this.libraryName = libraryName;
		this.address = address;
		this.books = books;
	}
	
	public List<Book> getBooks() {
		return books;	
	}
	
	public void addBook(Book b) {
		books.add(b);
	}
	
	public void removeBook(int bookIsbnNo) {
		for (Book book : books) {
			if(book.getBookIsbnNo() == bookIsbnNo) {
				books.remove(bookIsbnNo);
			}
		}
	}
}
