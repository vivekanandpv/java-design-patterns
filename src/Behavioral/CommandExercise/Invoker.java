package Behavioral.CommandExercise;


public class Invoker {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
