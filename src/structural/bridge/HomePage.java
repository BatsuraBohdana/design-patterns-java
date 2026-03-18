package structural.bridge;

public class HomePage implements WebPage{
    private final Theme theme;

    public HomePage(Theme theme) {
        this.theme = theme;
    }

    @Override
    public void load() {
        System.out.println("Відкривається Головна сторінка CyberNest...");
        theme.setBackground();
    }

    @Override
    public void interact() {
        System.out.println("Користувач читає новини на Головній сторінці.");
        theme.setTextColor();
    }

    @Override
    public void close() {
        System.out.println("Користувач закриває Головну сторінку.");
        theme.setButtonColor();
    }

    @Override
    public Theme getTheme() {
        return theme;
    }
}
