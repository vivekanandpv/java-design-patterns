package Behavioral.State;

public class StateDemo {
    public static void main(String[] args) {
        Fan fan = new Fan();

        System.out.println(fan);

        fan.changeState();

        System.out.println(fan);

        fan.changeState();

        System.out.println(fan);

        fan.changeState();

        System.out.println(fan);
    }
}
