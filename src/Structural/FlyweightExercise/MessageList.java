package Structural.FlyweightExercise;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MessageList {
    private final Registry registry = new Registry();
    private final List<Message> messages = new CopyOnWriteArrayList<>();

    public void sendMessage(MessageType messageType) {
        Message message = registry.lookup(messageType);
        messages.add(message);
    }

    public void report() {
        System.out.println("Messages sent: " + messages.size());
        System.out.println(registry.report());
    }
}
