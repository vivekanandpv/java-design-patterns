package Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
        initializeObjects();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }

        return item;
    }

    private void initializeObjects() {
        Movie moviePrototype = new Movie();
        moviePrototype.setTitle("Default Movie Title");
        moviePrototype.setPrice(100.00);
        moviePrototype.setUrl("Default Movie Url");
        moviePrototype.setRuntime("Default Length");
        this.items.put("Movie", moviePrototype);

        Book bookPrototype = new Book();
        bookPrototype.setTitle("Default Movie Title");
        bookPrototype.setPrice(100.00);
        bookPrototype.setUrl("Default Movie Url");
        bookPrototype.setAuthor("Default Book Author");
        this.items.put("Book", bookPrototype);
    }
}
