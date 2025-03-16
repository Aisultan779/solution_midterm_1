package smarthome;

public class Light implements SmartDevice {
    private String name;
    private boolean on = false;

    public Light(String name) {
        this.name = name;
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
        return name + " is " + (on ? "ON" : "OFF");
    }
}
