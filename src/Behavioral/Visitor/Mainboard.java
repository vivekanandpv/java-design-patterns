package Behavioral.Visitor;

public class Mainboard implements ComputerPart {
    @Override
    public void accept(PartVisitor visitor) {
        visitor.visit(this);
    }
}
