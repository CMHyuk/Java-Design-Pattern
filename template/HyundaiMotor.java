package template;

public class HyundaiMotor extends Motor {
    public HyundaiMotor(Door door) {
        super(door);
    }

    private void moneyHyundaiMotor(Direction direction) {
        System.out.println("direction = " + direction);
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == doorStatus.CLOSED) {
            door.close();
        }

        moneyHyundaiMotor(direction);
        setMotorStatus(motorStatus);
    }
}
