package behavioral.command;

public class ReadMemoryCommand implements Command {
    MemoryObject object;

    public ReadMemoryCommand(MemoryObject object) {
        this.object = object;
    }

    @Override
    public void execute() {
        object.readPast();
    }
}