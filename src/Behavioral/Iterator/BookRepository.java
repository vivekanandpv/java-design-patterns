package Behavioral.Iterator;

import java.util.Iterator;

public class BookRepository implements Iterable<Book> {
    private Book[] books;
    private int index = 0;

    public BookRepository() {
        this.books = new Book[10];
    }

    public void add(Book book) {
        if (index == books.length) {
            Book[] extendedArray = new Book[books.length + 10];
            System.arraycopy(books, 0, extendedArray, 0, 10);
            books = extendedArray;
        }

        books[index] = book;
        index++;
    }


    @Override
    public Iterator<Book> iterator() {
        return new Iterator<Book>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < books.length && books[currentIndex] != null;
            }

            @Override
            public Book next() {
                Book currentBook = books[currentIndex];
                currentIndex++;
                return currentBook;
            }
        };
    }
}
