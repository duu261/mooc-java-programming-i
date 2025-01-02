import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }

    public void addItem(Item item) {
        if (this.totalWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            this.totalWeight += item.getWeight();
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }

    }

    public int totalWeight() {
        return this.totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.size() > 0) {
            Item heaviestItem = this.items.get(0);
            for (Item item : this.items) {
                if (item.getWeight() > heaviestItem.getWeight()) {
                    heaviestItem = item;
                }
            }
            return heaviestItem;
        }
        return null;
    }

    @Override
    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        }

        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight + " kg)";
        }
        return this.items.size() + " items (" + this.totalWeight + " kg)";
    }

}
