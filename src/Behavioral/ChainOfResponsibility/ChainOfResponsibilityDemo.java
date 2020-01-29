package Behavioral.ChainOfResponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Pipeline requestProcessingPipeline = new Pipeline();

        requestProcessingPipeline.add(new ProcessorMiddleware("/api/items", "Items early endpoint"));
        requestProcessingPipeline.add(new ProcessorMiddleware("/api/items", "Items late endpoint"));
        requestProcessingPipeline.add(new ProcessorMiddleware("/api/persons", "Persons endpoint"));

        requestProcessingPipeline.matchPath(new Request("Client request for items", "/api/items"));
        requestProcessingPipeline.matchPath(new Request("Client request for persons", "/api/persons"));
    }
}
