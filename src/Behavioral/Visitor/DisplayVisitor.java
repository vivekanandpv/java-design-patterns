package Behavioral.Visitor;

public class DisplayVisitor implements PartVisitor {
    @Override
    public void visit(CPU cpu) {
        System.out.println("This is CPU");
    }

    @Override
    public void visit(Mainboard mainboard) {
        System.out.println("This is mainboard");
    }

    @Override
    public void visit(GraphicsCard graphicsCard) {
        System.out.println("This is graphic card");
    }

    @Override
    public void visit(SSD ssd) {
        System.out.println("This is SSD");
    }

    @Override
    public void visit(RAM ram) {
        System.out.println("This is RAM");
    }

    @Override
    public void visit(ComputerConfiguration computerConfiguration) {
        System.out.println("This is total configuration");
    }
}
