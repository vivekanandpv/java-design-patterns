package Behavioral.ChainOfResponsibility;

public abstract class Middleware {
    private Middleware nextMiddleware;
    private String path;


    public Middleware(String path) {
        this.path = path;
    }

    public abstract void process(Request request);

    public void setNext(Middleware middleware) {
        this.nextMiddleware = middleware;
    }

    public String getPath() {
        return this.path;
    }

    public Middleware getNextMiddleware() {
        return nextMiddleware;
    }
}
