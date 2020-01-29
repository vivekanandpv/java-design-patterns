package Behavioral.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository();

        repository.add(new Book("War and Peace"));
        repository.add(new Book("Anna Karenina"));
        repository.add(new Book("Crime and Punishment"));
        repository.add(new Book("The Brothers Karamazov"));

        for (Book book: repository) {
            System.out.println(book.getTitle());
        }
    }
}
