package Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ComputerConfiguration implements ComputerPart {
    private List<ComputerPart> parts = new ArrayList<>();

    public void addPart(ComputerPart part) {
        this.parts.add(part);
    }

    @Override
    public void accept(PartVisitor visitor) {
        for (ComputerPart part: this.parts) {
            part.accept(visitor);
        }

        visitor.visit(this);
    }
}
