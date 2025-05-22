package inventory;

import java.util.ArrayList;

public class Backpack {
    private ArrayList<String> items;

    public Backpack() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added to backpack.");
    }

    public void showItems() {
        System.out.println("=== Backpack Items ===");
        if (items.isEmpty()) {
            System.out.println("Backpack is empty.");
            return;
        }
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i+1) + ". " + items.get(i));
        }
    }
}
