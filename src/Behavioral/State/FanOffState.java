package Behavioral.State;

public class FanOffState extends State {
    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning on low state");
        this.fan.setState(this.fan.getFanLowState());
    }

    public String toString() {
        return "Fan is turned off";
    }
}
