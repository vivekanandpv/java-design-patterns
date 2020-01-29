package Structural.FlyweightExercise;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<MessageType, Message> messages = new HashMap<>();

    public Message lookup(MessageType type) {
        if (!messages.containsKey(type)) {
            messages.put(type, new Message(type.toString()));
        }

        return messages.get(type);
    }

    public String report() {
        return "Total created: " + messages.size();
    }
}
