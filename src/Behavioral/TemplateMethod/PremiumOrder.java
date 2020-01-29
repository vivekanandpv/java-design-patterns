package Behavioral.TemplateMethod;

public class PremiumOrder extends OrderTemplate {
    @Override
    public void prepareItems() {
        System.out.println("Processing premium order");
    }

    @Override
    public void packItems() {
        System.out.println("Packing premium order items");
    }

    @Override
    public void shipItems() {
        System.out.println("Shipping premium order items");
    }
}
