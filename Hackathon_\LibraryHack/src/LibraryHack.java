import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryHack {
	

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Library Service!!");
		
		String LibraryName = "Just Reading Library";
		String address = "32,Gandhipuram,Thanjavur,TamilNadu";
		Book b1 = new Book(0, "J.K Rowling", "Bloomsbury Publications");
		Book b2 = new Book(1, "Anne Frank", "Pearson Publications");
		Book b3 = new Book(2, "Emily Bronte", "MS Publications");
		Book b4 = new Book(1, "Olivia Wilde", "Classical Publications");
		Book b5 = new Book(1, "Tolkien", "WSI Publications");
		
		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		
		
		LibraryService library = new LibraryService(LibraryName, address, books);
		
		Customer customer = new Customer();
		
		String options = "yes";

		do {
			System.out.println("Choose Role : \n1.Admin \n2.Customer");
			String choice = inp.next().toLowerCase();
			
			switch (choice) {
			case "admin":
				System.out.println("Choose Service : \n1.View All books \n2.Add New books \n3.Delete books");
				int chooseAdminService = inp.nextInt();
				adminService(chooseAdminService,library);
				break;

			case "customer":
				System.out.println("Choose Service : \n1.View All books \n2.Borrow books");
				int chooseCustomerService = inp.nextInt();
				customerService(chooseCustomerService, library, customer);
				break;

			default:
				System.out.println("Invalid Role!! Please choose valid role!!");
				break;
			}
			
			System.out.println("Do you want to continue? type 'yes' or 'no'");
			options = inp.next();
		}while(options.equalsIgnoreCase("yes"));
		
		System.out.println("Thank you!!");
	}
	
	public static void adminService(int service, LibraryService library) {
		Scanner inp = new Scanner(System.in);
		switch (service) {
		case 1:
			List<Book> bookList = library.getBooks();
			for (Book book : bookList)
				System.out.println(book.toString());
			break;
		case 2:
			System.out.print("Enter New Book Details : ");
			System.out.println("Book No : ");
			int bookIsbnNo = inp.nextInt();
		
			System.out.println("Author : ");
			String author = inp.next();
			
			System.out.println("Publisher : ");
			String publisher = inp.next();
			
			Book NewBook = new Book(bookIsbnNo,author,publisher);
			library.addBook(NewBook);
			break;
			
		case 3:
			System.out.print("Enter book No : ");
			int bookNo = inp.nextInt();
			library.removeBook(bookNo);
			break;

		default:
			System.out.println("Please select correct option!!");
			break;
		}
	}
	
	public static void customerService(int service, LibraryService library, Customer customer) {
		Scanner inp = new Scanner(System.in);
		switch (service) {
		case 1:
			List<Book> bookList = library.getBooks();
			for (Book book : bookList)
				System.out.println(book.toString());
			break;
		case 2:
			System.out.print("Enter New Book Details : ");
			System.out.println("Book No : ");
			int bookIsbnNo = inp.nextInt();
		
			List<Book> books = library.getBooks();
			for (Book book : books) {
				if(book.getBookIsbnNo() == bookIsbnNo)
					customer.borrowBook(book);
			}
			
			break;

		default:
			System.out.println("Please select correct option!!");
			break;
		}
	}
	
	
}
