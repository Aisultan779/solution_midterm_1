package smarthome;

public class Thermostat implements SmartDevice {
    private String name;
    private boolean on = false;
    private int temperature = 20;

    public Thermostat(String name) {
        this.name = name;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(name + " set to " + temperature + "°C.");
    }

    @Override
    public void turnOn() {
        on = true;
        System.out.println(name + " is turned ON.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println(name + " is turned OFF.");
    }

    @Override
    public String getStatus() {
        return name + " is " + (on ? "ON" : "OFF") + " at " + temperature + "°C";
    }
}
