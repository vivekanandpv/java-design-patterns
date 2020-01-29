package Behavioral.Memento;

public class MementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Book book = new Book("Anna Karenina", "Novel");

        caretaker.save(book);

        book.setCategory("Fiction");

        caretaker.save(book);

        book.setTitle("War and Peace");

        caretaker.revert(book);
        caretaker.revert(book);

        System.out.println(book.getTitle() + " : " + book.getCategory());
    }
}
