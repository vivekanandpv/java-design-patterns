package Behavioral.Command;

public class AccountCreditCommand implements Command {
    private Transaction transaction;

    public AccountCreditCommand(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void execute() {
        this.transaction.credit();
    }
}
