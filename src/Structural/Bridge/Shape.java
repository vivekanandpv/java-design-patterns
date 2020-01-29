package Structural.Bridge;

public abstract class Shape {
    private Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }

    public final void applyColour() {
        this.colour.applyColour();
    }
}
