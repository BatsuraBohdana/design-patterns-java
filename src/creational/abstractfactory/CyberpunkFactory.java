package creational.abstractfactory;

public class CyberpunkFactory implements TransportFactory {
    @Override
    public Car createCar() { return new HoverCar(); }
    @Override
    public Aircraft createAircraft() { return new Drone(); }
}