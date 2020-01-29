package Behavioral.TemplateMethod;

public abstract class OrderTemplate {
    public abstract void prepareItems();

    public abstract void packItems();

    public abstract void shipItems();

    public final void process() {
        prepareItems();
        packItems();
        shipItems();
    }
}
