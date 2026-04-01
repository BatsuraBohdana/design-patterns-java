package behavioral.command;

public class TraverseMirrorCommand implements Command {
    MirrorPortal portal;

    public TraverseMirrorCommand(MirrorPortal portal) {
        this.portal = portal;
    }

    @Override
    public void execute() {
        portal.traverse();
    }
}