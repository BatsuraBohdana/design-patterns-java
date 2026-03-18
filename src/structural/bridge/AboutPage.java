package structural.bridge;

public class AboutPage implements WebPage{
    private final Theme theme;

    public AboutPage(Theme theme) {
        this.theme = theme;
    }

    @Override
    public void load() {
        System.out.println("Відкривається сторінка 'Про нас'...");
        theme.setBackground();
    }

    @Override
    public void interact() {
        System.out.println("Користувач переглядає інформацію про розробників.");
        theme.setTextColor();
    }

    @Override
    public void close() {
        System.out.println("Користувач залишає сторінку 'Про нас'.");
        theme.setButtonColor();
    }

    @Override
    public Theme getTheme() {
        return theme;
    }
}
