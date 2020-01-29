package Structural.Adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new NewBook("Anna Karenina", "Leo Tolstoy", 12, 1200, 1500));

        OldBook oldBook = new OldBook("Crime and Punishment", "Fyodor Dostoevsky", 15, 800, 950);
        books.add(new BookAdapter(oldBook));

        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}
