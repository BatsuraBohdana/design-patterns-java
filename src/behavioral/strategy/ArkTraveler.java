package behavioral.strategy;

public class ArkTraveler {

    private ArkTraversalStrategy strategy;

    public ArkTraveler(ArkTraversalStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(ArkTraversalStrategy strategy) {
        this.strategy = strategy;
    }

    public void startJourney() {
        strategy.execute();
    }
}