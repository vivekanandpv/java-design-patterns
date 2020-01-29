package Behavioral.CommandExercise;

public class NotifyShortageCommand implements Command {
    private Stock stock;

    public NotifyShortageCommand(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void execute() {
        this.stock.notifyShortage();
    }
}
