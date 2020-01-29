package Behavioral.State;

public class FanMediumState extends State {
    private Fan fan;

    public FanMediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning off the fan");
        this.fan.setState(this.fan.getFanOffState());
    }

    public String toString() {
        return "Fan is in medium state";
    }
}
