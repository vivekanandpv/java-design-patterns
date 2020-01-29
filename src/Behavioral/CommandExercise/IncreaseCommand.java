package Behavioral.CommandExercise;

public class IncreaseCommand implements Command {
    private Stock stock;

    public IncreaseCommand(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void execute() {
        this.stock.increase();
    }
}
