package structural.bridge;

public interface WebPage {
    void load();

    void interact();

    void close();

    Theme getTheme();
}
