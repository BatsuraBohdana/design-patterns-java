package creational.abstractfactory;

public record TransportFleet(Car car, Aircraft aircraft) {

    public static class FactoryMaker {

        public static TransportFactory makeFactory(TransportType type) {
            return switch (type) {
                case STEAMPUNK -> new SteampunkFactory();
                case CYBERPUNK -> new CyberpunkFactory();
            };
        }
    }
}