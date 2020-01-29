package Structural.Composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/menu");

        MenuItem travelMenuItem = new MenuItem("Travel", "/travel");

        mainMenu.add(travelMenuItem);

        Menu destinationsMenu = new Menu("Destinations", "/destinations");

        mainMenu.add(destinationsMenu);

        Menu galleryMenu = new Menu("Gallery", "/gallery");

        mainMenu.add(galleryMenu);

        System.out.println(mainMenu.toString());
    }
}
