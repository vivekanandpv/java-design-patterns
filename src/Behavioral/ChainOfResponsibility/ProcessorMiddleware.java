package Behavioral.ChainOfResponsibility;

public class ProcessorMiddleware extends Middleware {
    private String name;

    public ProcessorMiddleware(String path, String name) {
        super(path);
        this.name = name;
    }

    @Override
    public void process(Request request) {
        if (request.getPath().equals(this.getPath())) {
            System.out.println(String.format("Request %s for path %s handled at %s", request.getName(), request.getPath(), this.name));
        } else {
            this.getNextMiddleware().process(request);
        }
    }
}
