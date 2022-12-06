package observer.pratice1;

public class BatteryLevelDisplay implements Observer {
    private Battery battery;

    public BatteryLevelDisplay(Battery battery) {
        this.battery = battery;
    }

    public void update() {
        int level = battery.getLevel();
        System.out.println("level = " + level);
    }
}
