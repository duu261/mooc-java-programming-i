
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money aMoney = new Money(10, 10);
        Money bMoney = new Money(10, 20);
        System.out.println(aMoney);
        System.out.println(bMoney);
        Money cMoney = aMoney.plus(bMoney);
        System.out.println(cMoney);
        System.out.println(bMoney.lessThan(aMoney));
        Money dMoney = cMoney.minus(aMoney);
        System.out.println(dMoney);
    }
}
