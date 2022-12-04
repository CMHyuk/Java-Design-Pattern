package state;

public class Client {
    public static void main(String[] args) {
        Light light1 = new Light();

        light1.off_button_pushed();
        System.out.println(light1.getState());
        light1.on_button_pushed();
        System.out.println(light1.getState());
        light1.off_button_pushed();
        System.out.println(light1.getState());
        light1.off_button_pushed();
        System.out.println(light1.getState());

    }
}
