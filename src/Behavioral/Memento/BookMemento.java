package Behavioral.Memento;

public class BookMemento {
    private String title;
    private String category;

    public BookMemento(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }
}
