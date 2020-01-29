package Behavioral.CommandExercise;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Invoker invoker = new Invoker();

        List<Command> commands = new ArrayList<>();
        commands.add(new DecreaseCommand(stock));
        commands.add(new NotifyShortageCommand(stock));
        commands.add(new ProcessCommand(stock));
        commands.add(new ShipCommand(stock));

        for (Command command : commands) {
            invoker.storeAndExecute(command);
        }
    }
}
