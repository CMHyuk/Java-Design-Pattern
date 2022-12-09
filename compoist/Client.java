package compoist;

public class Client {
    public static void main(String[] args) {
        Body body = new Body(100, 70);
        Keyboard keyboard = new Keyboard(5, 2);
        Monitor monitor = new Monitor(20, 30);
        Speaker speaker = new Speaker(10, 10);

        Computer computer = new Computer();
        computer.addComponent(body);
        computer.addComponent(keyboard);
        computer.addComponent(monitor);
        computer.addComponent(speaker);

        int price = computer.getPrice();
        int power = computer.getPower();
        System.out.println("power = " + power);
        System.out.println("price = " + price + "만 원");
    }
}
