package Structural.FlyweightExercise;

public class FlyweightDemo {
    public static void main(String[] args) {
        MessageList list = new MessageList();

        list.sendMessage(MessageType.GOOD_AFTERNOON);
        list.sendMessage(MessageType.GOOD_AFTERNOON);
        list.sendMessage(MessageType.GOOD_AFTERNOON);
        list.sendMessage(MessageType.GOOD_AFTERNOON);
        list.sendMessage(MessageType.GOOD_AFTERNOON);
        list.sendMessage(MessageType.GOOD_AFTERNOON);
        list.sendMessage(MessageType.GOOD_AFTERNOON);
        list.sendMessage(MessageType.GOOD_AFTERNOON);
        list.sendMessage(MessageType.GOOD_AFTERNOON);
        list.sendMessage(MessageType.GOOD_AFTERNOON);
        list.sendMessage(MessageType.GOOD_EVENING);
        list.sendMessage(MessageType.GOOD_AFTERNOON);

        list.report();
    }
}
