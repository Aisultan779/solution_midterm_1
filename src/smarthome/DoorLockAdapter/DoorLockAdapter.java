package smarthome;

public class DoorLockAdapter implements SmartDevice {
    private LegacyDoorLockSystem legacyDoorLock;
    private boolean unlocked = false;

    public DoorLockAdapter(LegacyDoorLockSystem legacyDoorLock) {
        this.legacyDoorLock = legacyDoorLock;
    }

    @Override
    public void turnOn() {
        legacyDoorLock.unlockDoor();
        unlocked = true;
    }

    @Override
    public void turnOff() {
        legacyDoorLock.lockDoor();
        unlocked = false;
    }

    @Override
    public String getStatus() {
        return "Door Lock is " + (unlocked ? "Unlocked" : "Locked");
    }
}
