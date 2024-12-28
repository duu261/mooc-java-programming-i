
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// implement here the program that allows the user to enter 
		// book information and to examine them
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();

		while (true) {
			System.out.print("Tilte: ");
			String tilte = sc.nextLine();
			if (tilte.isEmpty()) {
				break;
			}
			System.out.print("Pages: ");
			int pages = Integer.parseInt(sc.nextLine());
			System.out.print("Publication year: ");
			String publicationYear = sc.nextLine();

			books.add(new Book(tilte, publicationYear, pages));

		}
		System.out.print("\nWhat information will be printed? ");
		String print = sc.nextLine();
		sc.close();
		for (Book book : books) {
			if (print.equals("name")) {
				System.out.println(book.getTilte());
			}
			if (print.equals("everything")) {
				System.out.println(book);
			}
		}

	}
}
