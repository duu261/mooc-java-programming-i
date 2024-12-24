
import java.util.ArrayList;

public class PrintInRange {

    public static void printNumbersInRange(ArrayList<Integer> numList,
            int lowerLimit, int upperLimit) {
        for (Integer num : numList) {
            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        // Try your method here
    }

}
