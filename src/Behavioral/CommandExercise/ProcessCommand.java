package Behavioral.CommandExercise;

public class ProcessCommand implements Command {
    private Stock stock;

    public ProcessCommand(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void execute() {
        this.stock.process();
    }
}
