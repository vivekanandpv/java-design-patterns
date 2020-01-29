package Behavioral.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {
    private List<Middleware> middlewares;

    public Pipeline() {
        this.middlewares = new ArrayList<>();
    }

    public void add(Middleware middleware) {
        int currentIndex = middlewares.size();

        if (currentIndex > 0) {
            Middleware previousMiddleware = middlewares.get(currentIndex - 1);
            previousMiddleware.setNext(middleware);
        }

        this.middlewares.add(middleware);
    }

    public void matchPath(Request request) {
        if (this.middlewares.size() > 0) {
            this.middlewares.get(0).process(request);
        }
    }
}
