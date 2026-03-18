package structural.bridge;

public class DarkTheme implements Theme{
    @Override
    public void setBackground() {
        System.out.println("Застосовано темно-сірий фон.");
    }

    @Override
    public void setTextColor() {
        System.out.println("Текст змінено на білий колір.");
    }

    @Override
    public void setButtonColor() {
        System.out.println("Кнопки підсвічуються неоново-синім.");
    }
}
