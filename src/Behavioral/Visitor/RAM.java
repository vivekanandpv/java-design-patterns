package Behavioral.Visitor;

public class RAM implements ComputerPart {
    @Override
    public void accept(PartVisitor visitor) {
        visitor.visit(this);
    }
}
