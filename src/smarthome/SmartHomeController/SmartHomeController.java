package smarthome;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllLightsOn() {
        System.out.println("Controller: Turning on all lights...");
        for (SmartDevice device : devices) {
            if (device instanceof CompositeDevice) {
                turnLightsInCompositeOn((CompositeDevice) device);
            } else if (device instanceof Light) {
                device.turnOn();
            }
        }
    }

    private void turnLightsInCompositeOn(CompositeDevice composite) {
        composite.turnOn();
    }

    public void setGlobalTemperature(int temperature) {
        System.out.println("Controller: Setting global temperature to " + temperature + "°C...");
        for (SmartDevice device : devices) {
            if (device instanceof CompositeDevice) {
                setTemperatureInComposite((CompositeDevice) device, temperature);
            } else if (device instanceof Thermostat) {
                ((Thermostat) device).setTemperature(temperature);
            }
        }
    }

    private void setTemperatureInComposite(CompositeDevice composite, int temperature) {
        composite.turnOn();
    }

    public String getSystemStatusReport() {
        StringBuilder report = new StringBuilder("System Status Report:\n");
        for (SmartDevice device : devices) {
            report.append(device.getStatus()).append("\n");
        }
        return report.toString();
    }
}
