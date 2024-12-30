
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate last = new SimpleDate(29, 12, 1999);
        System.out.println(last);
        last.advance();
        System.out.println(last);
        last.advance();
        System.out.println(last);
        last.advance(5);
        System.out.println(last);
        System.out.println(last.afterNumberOfDays(5));
        System.out.println(last);
    }
}
