
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int j = 1; j <= size; j++) {
            printSpaces(size - j);
            printStars(j);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // WARN: i really think ive need to learning more math
        // cant solve this all must ask an AI for the
        // printStars(2 * i - 1); part i feel upset af why
        // im didnt recognize this?
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
