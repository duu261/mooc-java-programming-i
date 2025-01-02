
public class Main {

    public static void main(String[] args) {

        // Try out your class here

        Stack stacks = new Stack();

        System.out.println(stacks.isEmpty());
        System.out.println(stacks.values());
        stacks.add("test");
        stacks.add("test2");
        System.out.println(stacks.isEmpty());
        System.out.println(stacks.values());
        System.out.println(stacks.take());
        stacks.add("1");
        stacks.add("2");
        stacks.add("3");
        stacks.add("4");
        stacks.add("5");

        while (!stacks.isEmpty()) {
            System.out.println(stacks.take());
        }

    }
}
