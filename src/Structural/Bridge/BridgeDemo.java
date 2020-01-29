package Structural.Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        //  Colours
        Red redColour = new Red("Red");
        Green greenColour = new Green("Green");

        //  Shapes
        Square greenSquare = new Square(greenColour);
        Rectangle redRectangle = new Rectangle(redColour);

        //  Operations
        greenSquare.applyColour();
        redRectangle.applyColour();
    }
}
