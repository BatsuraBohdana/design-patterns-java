package structural.bridge;

public class LightTheme implements Theme{
    @Override
    public void setBackground() {
        System.out.println("Застосовано білий фон.");
    }

    @Override
    public void setTextColor() {
        System.out.println("Текст змінено на чорний колір.");
    }

    @Override
    public void setButtonColor() {
        System.out.println("Кнопки стали класичними синіми.");
    }
}
