package Structural.Composite;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    protected String name;
    protected String url;

    protected List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public MenuComponent add(MenuComponent menuComponent) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("This operation is not yet supported");
    }

    public MenuComponent remove(MenuComponent menuComponent) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("This operation is not yet supported");
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        StringBuilder stringBuilder = new StringBuilder(this.name);
        stringBuilder.append(": ");
        stringBuilder.append(this.url);
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }
}
