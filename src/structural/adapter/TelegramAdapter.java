package structural.adapter;

public class TelegramAdapter implements Notification {
    private final TelegramApi telegram = new TelegramApi();

    @Override
    public void send() {
        telegram.sendMessageToChat();
    }
}
