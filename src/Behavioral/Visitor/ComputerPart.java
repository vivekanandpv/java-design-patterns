package Behavioral.Visitor;

public interface ComputerPart {
    public void accept(PartVisitor visitor);
}
