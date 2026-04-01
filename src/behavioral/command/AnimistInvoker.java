package behavioral.command;

public class AnimistInvoker {
    Command command;

    public AnimistInvoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}