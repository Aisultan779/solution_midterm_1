package smarthome;

public class AdvancedSmartHomeFactory implements SmartHomeFactory {
    @Override
    public SmartDevice createLight() {
        return new Light("Advanced Light");
    }

    @Override
    public SmartDevice createThermostat() {
        return new Thermostat("AI-based Thermostat");
    }

    @Override
    public SmartDevice createSecurityCamera() {
        return new SecurityCamera("Advanced Security Camera");
    }
}
