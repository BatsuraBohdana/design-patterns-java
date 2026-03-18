package structural.facade;

public class Drummer extends Musician {

    @Override
    public void playMusic() {
        System.out.println(name() + " задає шалений ритм на барабанах.");
    }

    @Override
    public String name() {
        return "Барабанщик";
    }
}