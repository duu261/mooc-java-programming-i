
public class Main {

    public static void main(String[] args) {

        // use this main method to try out your classes!
        Gift gift = new Gift("Duu", 2);
        Package pkg = new Package();
        System.out.println(gift.getName());
        System.out.println(gift.getWeight());
        System.out.println(gift);
        pkg.addGift(gift);
        System.out.println(pkg.totalWeight());
        System.out.println(pkg);

    }
}
