package structural.facade;

public class Vocalist extends Musician {

    @Override
    public void playMusic() {
        System.out.println(name() + " співає хіт разом із залом.");
    }

    @Override
    public String name() {
        return "Вокаліст";
    }
}