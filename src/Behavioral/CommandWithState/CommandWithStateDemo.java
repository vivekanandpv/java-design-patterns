package Behavioral.CommandWithState;

import java.util.ArrayList;
import java.util.List;

public class CommandWithStateDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Switch _switch = new Switch();

        Command toggleCommand = new ToggleCommand(light);

        List<Light> lights = new ArrayList<>();

        lights.add(light);
        lights.add(new Light());
        lights.add(new Light());
        lights.add(new Light());
        lights.add(new Light());

        Command allLightsCommand = new AllLightsCommand(lights);

        _switch.storeAndExecute(toggleCommand);

        _switch.storeAndExecute(allLightsCommand);
    }
}
