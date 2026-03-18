package structural.adapter;

public class SystemAlert {
    private final Notification notification;

    public SystemAlert(Notification notification) {
        this.notification = notification;
    }

    public void alertAdmin() {
        notification.send();
    }
}
