package Behavioral.CommandExercise;

public class CompleteCommand implements Command {
    private Stock stock;

    public CompleteCommand(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void execute() {
        this.stock.complete();
    }
}
