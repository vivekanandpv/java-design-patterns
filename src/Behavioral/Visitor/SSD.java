package Behavioral.Visitor;

public class SSD implements ComputerPart {
    @Override
    public void accept(PartVisitor visitor) {
        visitor.visit(this);
    }
}
