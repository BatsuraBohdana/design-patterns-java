package creational.abstractfactory;

public class Zeppelin implements Aircraft {
    @Override
    public void fly() {
        System.out.println(" Величезний дирижабль повільно підіймається в небо.");
    }
}