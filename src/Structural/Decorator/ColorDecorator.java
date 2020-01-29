package Structural.Decorator;

public class ColorDecorator extends Decorator {
    public ColorDecorator(Widget widget) {
        super(widget);
    }

    public void draw() {
        super.draw();
        System.out.println("Color decorator applied");
    }
}
