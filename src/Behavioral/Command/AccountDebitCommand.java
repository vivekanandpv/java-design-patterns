package Behavioral.Command;

//  Concrete command
public class AccountDebitCommand implements Command {
    private Transaction transaction;

    public AccountDebitCommand(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void execute() {
        this.transaction.debit();
    }
}
