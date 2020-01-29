package Structural.Bridge;

public abstract class Colour {
    private String colour;
    public Colour(String colour) {
        this.colour = colour;
    }

    public final String getColour() {
        return colour;
    }

    public final void applyColour() {
        System.out.println(String.format("Applying %s", getColour()));
    };
}
