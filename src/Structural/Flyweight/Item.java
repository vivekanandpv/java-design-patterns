package Structural.Flyweight;

//  Items will be the flyweights
public class Item {
    //  Has to be immutable
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
