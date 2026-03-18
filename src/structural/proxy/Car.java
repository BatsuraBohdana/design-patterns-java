package structural.proxy;

public class Car {
    private final String licensePlate;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Машина [" + licensePlate + "]";
    }
}
