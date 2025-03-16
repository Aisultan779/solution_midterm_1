package smarthome;

public class BasicSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createLight() {
        return new Light("Basic Light");
    }

    @Override
    public SmartDevice createThermostat() {
        return new Thermostat("Basic Thermostat");
    }

    @Override
    public SmartDevice createSecurityCamera() {
        return new SecurityCamera("Basic Security Camera");
    }
}
