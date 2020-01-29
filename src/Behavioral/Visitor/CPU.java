package Behavioral.Visitor;

public class CPU implements ComputerPart {
    @Override
    public void accept(PartVisitor visitor) {
        visitor.visit(this);
    }
}
