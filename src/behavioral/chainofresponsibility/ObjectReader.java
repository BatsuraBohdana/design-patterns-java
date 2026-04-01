package behavioral.chainofresponsibility;

public class ObjectReader implements AnomalyHandler {
    @Override
    public boolean canHandleAnomaly(MagicalAnomaly anomaly) {
        return anomaly.getAnomalyType() == AnomalyType.MEMORY_ECHO;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handle(MagicalAnomaly anomaly) {
        anomaly.markHandled();
        System.out.println(name() + " зачитує минуле та заспокоює: " + anomaly);
    }

    @Override
    public String name() {
        return "Читець предметів";
    }
}