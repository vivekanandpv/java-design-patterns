package Behavioral.CommandExercise;

public class ShipCommand implements Command {
    private Stock stock;

    public ShipCommand(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void execute() {
        this.stock.ship();
    }
}
