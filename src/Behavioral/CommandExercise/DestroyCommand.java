package Behavioral.CommandExercise;

public class DestroyCommand implements Command {
    private Stock stock;

    public DestroyCommand(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void execute() {
        this.stock.destroy();
    }
}
