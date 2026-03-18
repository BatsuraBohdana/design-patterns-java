package structural.facade;

public class Guitarist extends Musician {

    @Override
    public void playMusic() {
        System.out.println(name() + " грає потужне соло на електрогітарі.");
    }

    @Override
    public String name() {
        return "Гітарист";
    }
}