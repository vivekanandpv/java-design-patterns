package Behavioral.Mediator;

public class Light {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (this.isOn) {
            this.off();
            this.isOn = false;
        } else {
            this.on();
            this.isOn = true;
        }
    }

    private void on() {
        System.out.println("Light turned on");
    }

    private void off() {
        System.out.println("Light turned off");
    }
}
