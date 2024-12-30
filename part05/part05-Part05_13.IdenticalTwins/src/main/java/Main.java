
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program

        Person duu = new Person("Duu", new SimpleDate(26, 1, 2002), 180, 65);
        Person duuEqual = duu;
        Person duu2 = new Person("Du", new SimpleDate(26, 1, 2002), 180, 65);
        System.out.println(duu.equals(duu2));
        System.out.println(duu.equals(duuEqual));

    }
}
