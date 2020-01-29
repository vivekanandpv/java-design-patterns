package Structural.Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Widget widget = new BorderDecorator(new BorderDecorator(new ColorDecorator(new MultilineDecorator(new TextField(120, 100)))));
        widget.draw();
    }
}
