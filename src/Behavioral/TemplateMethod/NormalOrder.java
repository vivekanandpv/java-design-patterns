package Behavioral.TemplateMethod;

public class NormalOrder extends OrderTemplate {
    @Override
    public void prepareItems() {
        System.out.println("Preparing normal order");
    }

    @Override
    public void packItems() {
        System.out.println("Packing normal order");
    }

    @Override
    public void shipItems() {
        System.out.println("Shipping normal order");
    }
}
