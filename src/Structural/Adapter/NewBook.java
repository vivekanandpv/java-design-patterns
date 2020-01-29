package Structural.Adapter;

public class NewBook implements Book {
    private String title;
    private String author;
    private int pages;
    private int edition;
    private int price;

    public NewBook(String title, String author, int edition, int pages, int price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.edition = edition;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
