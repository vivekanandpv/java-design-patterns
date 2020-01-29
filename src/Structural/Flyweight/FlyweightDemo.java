package Structural.Flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("LG Monitor", 150);
        inventorySystem.takeOrder("LG Monitor", 150);
        inventorySystem.takeOrder("LG Monitor", 150);
        inventorySystem.takeOrder("LG Monitor", 150);
        inventorySystem.takeOrder("LG Monitor", 150);
        inventorySystem.takeOrder("Samsung 4K LED TV", 200);
        inventorySystem.takeOrder("Samsung 4K LED TV", 200);
        inventorySystem.takeOrder("Samsung 4K LED TV", 200);
        inventorySystem.takeOrder("Samsung 4K LED TV", 200);

        inventorySystem.process();

        System.out.println(inventorySystem.report());
    }
}
