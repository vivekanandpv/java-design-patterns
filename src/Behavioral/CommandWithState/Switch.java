package Behavioral.CommandWithState;

public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
