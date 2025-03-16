package smarthome;

public interface SmartHomeFactory {
    SmartDevice createLight();
    SmartDevice createThermostat();
    SmartDevice createSecurityCamera();
}
