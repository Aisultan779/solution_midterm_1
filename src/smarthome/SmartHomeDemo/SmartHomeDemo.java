package smarthome;

public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartHomeFactory factory = new BasicSmartHomeFactory();
        SmartDevice basicLight = factory.createLight();
        SmartDevice basicThermostat = factory.createThermostat();
        SmartDevice basicCamera = factory.createSecurityCamera();

        SmartDevice scheduledLight = new ScheduledOperationDecorator(basicLight, "8:00 AM", "10:00 PM");

        CompositeDevice livingRoom = new CompositeDevice("Living Room");
        livingRoom.addDevice(scheduledLight);
        livingRoom.addDevice(basicThermostat);
        livingRoom.addDevice(basicCamera);

        LegacyDoorLockSystem legacyDoorLock = new LegacyDoorLockSystem();
        SmartDevice doorLock = new DoorLockAdapter(legacyDoorLock);

        SmartHomeController controller = new SmartHomeController();
        controller.addDevice(livingRoom);
        controller.addDevice(doorLock);

        System.out.println("=== Управление Smart Home ===");
        System.out.println("\nTurning on all lights via Facade...");
        controller.turnAllLightsOn();

        System.out.println("\nSetting global temperature via Facade...");
        controller.setGlobalTemperature(22);

        System.out.println("\nSystem status report:");
        System.out.println(controller.getSystemStatusReport());
    }
}
