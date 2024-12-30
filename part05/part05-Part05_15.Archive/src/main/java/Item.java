import java.util.Objects;

public class Item {

    private String identifier, name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    // public boolean equals(Object compared) {
    // if (this == compared) {
    // return true;
    // }
    //
    // if (!(compared instanceof Item)) {
    // return false;
    // }
    //
    // Item comparedItem = (Item) compared;
    //
    // return this.identifier.equals(comparedItem.identifier);
    //
    // }

    public String toString() {
        return this.identifier + ": " + this.name;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Item other = (Item) obj;
        return Objects.equals(identifier, other.identifier);
    }
}
