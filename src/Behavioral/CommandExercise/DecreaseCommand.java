package Behavioral.CommandExercise;

public class DecreaseCommand implements Command {
    private Stock stock;

    public DecreaseCommand(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void execute() {
        this.stock.decrease();
    }
}
