
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        scanner.close();

        try (Scanner fileRead = new Scanner(Paths.get(file))) {
            while (fileRead.hasNextLine()) {
                String line = fileRead.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] split = line.split(",");
                String name = split[0];
                int age = Integer.parseInt(split[1]);
                if (age != 1) {
                    System.out.println(name + ", age: " + age + " years");
                    continue;
                }
                System.out.println(name + ", age: " + age + " year");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
