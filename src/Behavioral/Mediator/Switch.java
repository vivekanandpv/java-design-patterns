package Behavioral.Mediator;

public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
