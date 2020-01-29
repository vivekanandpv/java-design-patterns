package Structural.Decorator;

public abstract class Decorator implements Widget {
    private Widget widget;

    public Decorator(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void draw() {
        this.widget.draw();
    }
}
