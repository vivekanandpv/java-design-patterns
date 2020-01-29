package Behavioral.State;

public class FanLowState extends State {
    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning on medium state");
        this.fan.setState(this.fan.getFanMediumState());
    }

    public String toString() {
        return "Fan is in low state";
    }
}
