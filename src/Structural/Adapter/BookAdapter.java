package Structural.Adapter;

public class BookAdapter implements Book {
    private OldBook instance;

    public BookAdapter(OldBook instance) {
        this.instance = instance;
    }


    @Override
    public String getTitle() {
        return instance.get_title();
    }

    @Override
    public String getAuthor() {
        return instance.get_author();
    }

    @Override
    public int getPages() {
        return instance.get_pages();
    }

    @Override
    public int getEdition() {
        return instance.get_edition();
    }

    @Override
    public int getPrice() {
        return instance.get_price();
    }
}
