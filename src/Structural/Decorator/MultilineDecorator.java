package Structural.Decorator;

public class MultilineDecorator extends Decorator {

    public MultilineDecorator(Widget widget) {
        super(widget);
    }

    public void draw() {
        super.draw();
        System.out.println("Multiline decorator applied");
    }
}
