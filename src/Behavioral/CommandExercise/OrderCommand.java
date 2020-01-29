package Behavioral.CommandExercise;

public class OrderCommand implements Command {
    private Stock stock;

    public OrderCommand(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void execute() {
        this.stock.order();
    }
}
