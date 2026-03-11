package creational.abstractfactory;

public class SteampunkFactory implements TransportFactory {
    @Override
    public Car createCar() { return new SteamCar(); }
    @Override
    public Aircraft createAircraft() { return new Zeppelin(); }
}