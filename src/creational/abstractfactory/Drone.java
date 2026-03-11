package creational.abstractfactory;

public class Drone implements Aircraft {
    @Override
    public void fly() {
        System.out.println(" Кібер-дрон стрімко маневрує крізь хмарочоси.");
    }
}