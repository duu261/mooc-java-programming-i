
import java.util.Scanner;

public class GiftTax {

    private static final double[] LIMITS = { 5000, 25000, 55000, 200000, 1000000 };
    private static final double[] BASE_TAXES = { 100, 1700, 4700, 22100, 142100 };
    private static final double[] RATES = { 0.08, 0.1, 0.12, 0.15, 0.17 };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift? ");
        double valueOfGift = Double.valueOf(scan.nextLine());
        double tax = calculateTax(valueOfGift);
        if (tax == 0) {
            System.out.println("No tax");
        } else {
            System.out.println("Tax: " + tax);
        }
        // double valueOfGift;
        // double tax = 0;
        // System.out.println("Value of the gift? ");
        // valueOfGift = Double.valueOf(scan.nextLine());
        // if (valueOfGift < 5000) {
        // System.out.println("No tax");
        // } else if (valueOfGift <= 25000) {
        // tax = 100 + (valueOfGift - 5000) * 0.08;
        // } else if (valueOfGift <= 55000) {
        // tax = 1700 + (valueOfGift - 25000) * 0.1;
        // } else if (valueOfGift <= 200000) {
        // tax = 4700 + (valueOfGift - 55000) * 0.12;
        // } else if (valueOfGift <= 1000000) {
        // tax = 22100 + (valueOfGift - 200000) * 0.15;
        // } else {
        // tax = 142100 + (valueOfGift - 1000000) * 0.17;
        // }
        //
        // if (valueOfGift >= 5000) {
        // System.out.print("Tax: " + tax);
        //
        // }
        scan.close();
    }

    private static double calculateTax(double valueOfGift) {
        if (valueOfGift < LIMITS[0]) {
            return 0;
        }

        for (int i = LIMITS.length - 1; i >= 0; i--) {
            if (valueOfGift > LIMITS[i]) {
                return BASE_TAXES[i] + (valueOfGift - LIMITS[i]) * RATES[i];
            }
        }
        return 0;
    }
}
