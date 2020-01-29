package Behavioral.Visitor;

public interface PartVisitor {

    public void visit(CPU cpu);
    public void visit(Mainboard mainboard);
    public void visit(GraphicsCard graphicsCard);
    public void visit(SSD ssd);
    public void visit(RAM ram);
    public void visit(ComputerConfiguration computerConfiguration);
}
