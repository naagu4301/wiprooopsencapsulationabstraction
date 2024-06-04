package wipro_oops.com;
import java.util.*;
public class bookandauthor {
	public static void main(String[] args) {
		author a = new author("J.K. Rowling", "jkrowling@email.com", 'F');
	    book b = new book("Harry Potter", a, 20.99, 100);
	    System.out.println("Book Name: " + b.getName());
	    System.out.println("Author: " + b.getAuthor().getName());
	    System.out.println("Price: "+b.getPrice());
	    System.out.println("qtyInStock: "+b.getQtyInStock());
	    System.out.println("Email: "+a.getEmail());
	    System.out.println("Gender: "+a.getGender());
}
}
