package template;

public class LGMotor extends Motor {
    public LGMotor(Door door) {
        super(door);
    }

    private void moveLGMotor(Direction direction) {
        System.out.println("direction = " + direction);
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) {
            door.close();
        }

        moveLGMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}
