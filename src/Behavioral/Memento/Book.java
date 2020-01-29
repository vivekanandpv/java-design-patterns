package Behavioral.Memento;

public class Book {
    private String title;
    private String category;

    public Book(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BookMemento save() {
        return new BookMemento(this.getTitle(), this.getCategory());
    }

    public void revert(BookMemento memento) {
        this.setTitle(memento.getTitle());
        this.setCategory(memento.getCategory());
    }
}
