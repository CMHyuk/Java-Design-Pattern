package state;

public class OFF implements State {

    public OFF(Light light) {
        light.setState(this);
    }

    public OFF() {
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On!");
        light.setState(new ON(light));
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("반응 없음");
    }
}
