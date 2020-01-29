package Behavioral.State;

public class Fan {
    State offState;
    State lowSate;
    State mediumState;
    State currentState;

    public Fan() {
        this.offState = new FanOffState(this);
        this.lowSate = new FanLowState(this);
        this.mediumState = new FanMediumState(this);

        //  Initialize the state to off
        this.currentState = this.offState;
    }

    public void changeState() {
        this.currentState.handleRequest();
    }

    public String toString() {
        return this.currentState.toString();
    }

    public State getFanLowState() {
        return this.lowSate;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getFanMediumState() {
        return this.mediumState;
    }

    public State getFanOffState() {
        return this.offState;
    }
}
