package smarthome;

public class SecurityCamera implements SmartDevice {
    private String name;
    private boolean on = false;

    public SecurityCamera(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        on = true;
        System.out.println(name + " is activated.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println(name + " is deactivated.");
    }

    @Override
    public String getStatus() {
        return name + " is " + (on ? "active" : "inactive");
    }
}
