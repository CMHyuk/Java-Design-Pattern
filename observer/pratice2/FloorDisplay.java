package observer.pratice2;

public class FloorDisplay implements Observer {
    private ElevatorController controller;

    public FloorDisplay(ElevatorController controller) {
        this.controller = controller;
    }

    @Override
    public void update() {
        int curFloor = controller.getCurFloor();
        System.out.println("Floor Display: " + curFloor);
    }
}
