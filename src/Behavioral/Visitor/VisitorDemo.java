package Behavioral.Visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        ComputerConfiguration configuration = new ComputerConfiguration();
        configuration.addPart(new CPU());
        configuration.addPart(new Mainboard());
        configuration.addPart(new RAM());

        configuration.accept(new DisplayVisitor());

        System.out.println("-----------------------------");

        configuration.accept(new ShoppingCartVisitor());
    }
}
