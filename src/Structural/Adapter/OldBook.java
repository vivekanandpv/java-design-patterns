package Structural.Adapter;

public class OldBook {
    private String _title;
    private String _author;
    private int _pages;
    private int _edition;
    private int _price;

    public OldBook(String title, String author, int edition, int pages, int price) {
        this._title = title;
        this._author = author;
        this._pages = pages;
        this._edition = edition;
        this._price = price;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_author() {
        return _author;
    }

    public void set_author(String _author) {
        this._author = _author;
    }

    public int get_pages() {
        return _pages;
    }

    public void set_pages(int _pages) {
        this._pages = _pages;
    }

    public int get_edition() {
        return _edition;
    }

    public void set_edition(int _edition) {
        this._edition = _edition;
    }

    public int get_price() {
        return _price;
    }

    public void set_price(int _price) {
        this._price = _price;
    }
}
