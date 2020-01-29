package Structural.Decorator;

public class TextField implements Widget {
    private int height;
    private int width;

    public TextField(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Textfield with " + height + ", " + width);
    }
}
