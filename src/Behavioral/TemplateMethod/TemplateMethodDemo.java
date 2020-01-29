package Behavioral.TemplateMethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        OrderTemplate premiumOrder = new PremiumOrder();
        OrderTemplate normalOrder = new NormalOrder();

        premiumOrder.process();
        normalOrder.process();
    }
}
