package Structural.Composite;

import java.util.Iterator;

public class Menu extends MenuComponent {
    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(print(this));

        Iterator<MenuComponent> iterator = menuComponents.iterator();

        while(iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            stringBuilder.append(menuComponent.toString());
        }

        return stringBuilder.toString();
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        this.menuComponents.remove(menuComponent);
        return menuComponent;
    }


}
