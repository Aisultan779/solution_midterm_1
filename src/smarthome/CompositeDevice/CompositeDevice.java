package smarthome;

import java.util.ArrayList;
import java.util.List;

public class CompositeDevice implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public CompositeDevice(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    @Override
    public String getStatus() {
        StringBuilder status = new StringBuilder("Status of " + name + ":\n");
        for (SmartDevice device : devices) {
            status.append(" - ").append(device.getStatus()).append("\n");
        }
        return status.toString();
    }
}
