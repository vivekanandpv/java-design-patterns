package Behavioral.Command;

//  Invoker
public class Processor {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
