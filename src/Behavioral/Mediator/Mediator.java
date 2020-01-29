package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Light> lights = new ArrayList<>();

    public void register(Light light) {
        lights.add(light);
    }

    public void turnOnLights() {
        for (Light light: lights) {
            if (!light.isOn()) {
                light.toggle();
            }
        }
    }

    public void turnOffLights() {
        for (Light light: lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
