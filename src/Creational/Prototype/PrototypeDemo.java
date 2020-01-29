package Creational.Prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();

        Movie firstMovie = (Movie) registry.createItem("Movie");
        firstMovie.setTitle("First Movie Title");
        firstMovie.setPrice(101);
        firstMovie.setUrl("First Movie Url");
        firstMovie.setRuntime("First Movie Runtime");

        Movie secondMovie = (Movie) registry.createItem("Movie");
        secondMovie.setTitle("Second Movie Title");
        secondMovie.setPrice(102);
        secondMovie.setUrl("Second Movie Url");
        secondMovie.setRuntime("Second Movie Runtime");

        System.out.println(firstMovie);
        System.out.println(firstMovie.getTitle());
        System.out.println(firstMovie.getPrice());
        System.out.println(firstMovie.getUrl());
        System.out.println(firstMovie.getRuntime());

        System.out.println(secondMovie);
        System.out.println(secondMovie.getTitle());
        System.out.println(secondMovie.getPrice());
        System.out.println(secondMovie.getUrl());
        System.out.println(secondMovie.getRuntime());
    }
}
