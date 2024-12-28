
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

		String name = " ";
		while (!name.isEmpty()) {			
			System.out.print("Name: ");
			 name = scanner.nextLine();
			 items.add(new Item(name));
		}
		for (Item item : items) {
			System.out.println(item);
		}
    }
}