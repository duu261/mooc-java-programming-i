
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        Person duu = new Person("Duu", 20, 200, 75);
        HealthStation hStation = new HealthStation();
        System.out.println(hStation.weigh(duu));
        hStation.feed(duu);
        System.out.println(hStation.weigh(duu));
        System.out.println(hStation.weighings());

    }
}
