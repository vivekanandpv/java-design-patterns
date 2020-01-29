package Behavioral.ChainOfResponsibility;

public class Request {
    private String name;
    private String path;

    public Request(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }
}
