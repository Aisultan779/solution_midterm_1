package smarthome;

public class ScheduledOperationDecorator extends DeviceDecorator {
    private String onTime;
    private String offTime;

    public ScheduledOperationDecorator(SmartDevice device, String onTime, String offTime) {
        super(device);
        this.onTime = onTime;
        this.offTime = offTime;
    }

    @Override
    public void turnOn() {
        System.out.println("Scheduled to turn ON at " + onTime);
        decoratedDevice.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Scheduled to turn OFF at " + offTime);
        decoratedDevice.turnOff();
    }

    @Override
    public String getStatus() {
        return decoratedDevice.getStatus() + " (Scheduled: ON at " + onTime + ", OFF at " + offTime + ")";
    }
}
