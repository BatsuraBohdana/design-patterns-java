package behavioral.chainofresponsibility;

public class NoviceIllusionist implements AnomalyHandler {
    @Override
    public boolean canHandleAnomaly(MagicalAnomaly anomaly) {
        return anomaly.getAnomalyType() == AnomalyType.MINOR_ILLUSION;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handle(MagicalAnomaly anomaly) {
        anomaly.markHandled();
        System.out.println(name() + " розсіює аномалію: " + anomaly);
    }

    @Override
    public String name() {
        return "Учень-ілюзіоніст";
    }
}