package Behavioral.Mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator  = new Mediator();
        Light light = new Light();
        Switch _switch = new Switch();

        Command onCommand = new OnCommand(mediator);
        Command offCommand = new OffCommand(mediator);


        mediator.register(light);
        mediator.register(new Light());
        mediator.register(new Light());
        mediator.register(new Light());
        mediator.register(new Light());

        _switch.storeAndExecute(onCommand);
        _switch.storeAndExecute(offCommand);
    }
}
