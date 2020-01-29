package Behavioral.Visitor;

public class GraphicsCard implements ComputerPart {
    @Override
    public void accept(PartVisitor visitor) {
        visitor.visit(this);
    }
}
