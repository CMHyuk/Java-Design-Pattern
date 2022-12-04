package command.pratice1;

public class PowerCommand implements Command {
    private TV tv;

    public PowerCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.power();
    }
}
