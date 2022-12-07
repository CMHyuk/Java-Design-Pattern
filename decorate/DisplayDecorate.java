package decorate;

public class DisplayDecorate extends Display {

    private Display decorateDisplay;

    public DisplayDecorate(Display decorateDisplay) {
        this.decorateDisplay = decorateDisplay;
    }

    @Override
    public void draw() {
        decorateDisplay.draw();
    }
}
