package observer.pratice2;

public class ControlRoomDisplay implements Observer {
    private ElevatorController controller;

    public ControlRoomDisplay(ElevatorController controller) {
        this.controller = controller;
    }

    @Override
    public void update() {
        int curFloor = controller.getCurFloor();
        System.out.println("Control Room: " + curFloor);
    }
}
