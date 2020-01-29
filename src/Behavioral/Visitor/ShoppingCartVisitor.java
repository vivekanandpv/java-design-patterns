package Behavioral.Visitor;

public class ShoppingCartVisitor implements PartVisitor {
    @Override
    public void visit(CPU cpu) {
        System.out.println("Adding CPU");
    }

    @Override
    public void visit(Mainboard mainboard) {
        System.out.println("Adding mainboard");
    }

    @Override
    public void visit(GraphicsCard graphicsCard) {
        System.out.println("Adding graphics card");
    }

    @Override
    public void visit(SSD ssd) {
        System.out.println("Adding SSD");
    }

    @Override
    public void visit(RAM ram) {
        System.out.println("Adding RAM");
    }

    @Override
    public void visit(ComputerConfiguration computerConfiguration) {
        System.out.println("Ready to process the order");
    }
}
