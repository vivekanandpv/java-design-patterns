package Behavioral.Command;

public class CommandDemo {
    public static void main(String[] args) {
        Transaction transaction= new Transaction();
        Processor processor = new Processor();

        Command debit = new AccountDebitCommand(transaction);

        processor.storeAndExecute(debit);
    }
}
