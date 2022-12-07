package decorate;

public class LaneDecorator extends DisplayDecorate {
    public LaneDecorator(Display decorateDisplay) {
        super(decorateDisplay);
    }

    public void draw() {
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("\t차선 표시");
    }
}
