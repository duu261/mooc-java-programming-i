import java.util.ArrayList;

public class Room {

    private ArrayList<Person> person;

    public Room() {
        this.person = new ArrayList<>();
    }

    public void add(Person person) {
        this.person.add(person);
    }

    public boolean isEmpty() {
        return this.person.isEmpty();
    }

    public ArrayList<Person> getPersons() {

        ArrayList<Person> persons = new ArrayList<>();

        for (Person person : this.person) {
            persons.add(person);
        }
        return persons;
    }

    public Person shortest() {
        if (!this.person.isEmpty()) {
            Person shortestPerson = this.person.get(0);
            for (Person person : this.person) {
                if (person.getHeight() < shortestPerson.getHeight()) {
                    shortestPerson = person;
                }
            }
            return shortestPerson;
        }
        return null;
    }

    public Person take() {
        if (this.person.isEmpty()) {
            return null;
        }
        Person shortest = this.shortest();
        this.person.remove(this.shortest());
        return shortest;
    }
}
