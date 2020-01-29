package Behavioral.Memento;

import java.util.Stack;

public class Caretaker {
    private Stack<BookMemento> history = new Stack<>();

    public void save(Book book) {
        this.history.push(book.save());
    }

    public void revert(Book book) {
        book.revert(this.history.pop());
    }
}
