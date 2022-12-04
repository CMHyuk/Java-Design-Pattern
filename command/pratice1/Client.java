package command.pratice1;

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        TwoButtonController rc = new TwoButtonController();

        PowerCommand powerCommand = new PowerCommand(tv);
        rc.setTwoButtonController(powerCommand, powerCommand);

        rc.button1Pressed();
        rc.button2Pressed();
        rc.button1Pressed();
        rc.button1Pressed();
        rc.button2Pressed();
        rc.button1Pressed();
    }
}
