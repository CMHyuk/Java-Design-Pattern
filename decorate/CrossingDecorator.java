package decorate;

public class CrossingDecorator extends Display {
    private Display decoratedDisplay;

    public CrossingDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
    }
}
