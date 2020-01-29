package Behavioral.Mediator;

public class OnCommand implements Command {
    private Mediator mediator;

    public OnCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        this.mediator.turnOnLights();
    }
}
