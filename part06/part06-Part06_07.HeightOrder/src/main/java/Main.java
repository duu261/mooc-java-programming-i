
public class Main {

    public static void main(String[] args) {
        // Test your class here

        Room room = new Room();
        System.out.println("Empty" + room.isEmpty());
        room.add(new Person("duu", 200));
        room.add(new Person("a", 100));
        room.add(new Person("b", 300));
        System.out.println("Empty" + room.isEmpty());

        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        System.out.println(room.shortest());

        System.out.println();
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("take" + room.take());

        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("take" + room.take());

        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
    }
}
