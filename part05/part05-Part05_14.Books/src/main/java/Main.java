import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            // boolean bookExist = false;
            // for (Book comparedBook : books) {
            // if (comparedBook.equals(book)) {
            // System.out.println("The book is already on the list. Let's not add the same
            // book again.");
            // bookExist = true;
            // break;
            // }
            // }
            // if (!bookExist) {
            // books.add(book);
            // }
            if (books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                books.add(book);
            }
        }
        scanner.close();

        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}