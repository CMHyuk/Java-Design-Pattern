package observer.pratice2;

public class ElevatorDisplay implements Observer {
    private ElevatorController controller;

    public ElevatorDisplay(ElevatorController controller) {
        this.controller = controller;
    }

    @Override
    public void update() {
        int curFloor = controller.getCurFloor();
        System.out.println("Elevator Display: " + curFloor);
    }
}
