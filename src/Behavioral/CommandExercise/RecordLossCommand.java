package Behavioral.CommandExercise;

public class RecordLossCommand implements Command {
    private Stock stock;

    public RecordLossCommand(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void execute() {
        this.stock.recordLoss();
    }
}
