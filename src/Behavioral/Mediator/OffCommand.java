package Behavioral.Mediator;

public class OffCommand implements Command {
    private Mediator mediator;

    public OffCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        this.mediator.turnOffLights();
    }
}
