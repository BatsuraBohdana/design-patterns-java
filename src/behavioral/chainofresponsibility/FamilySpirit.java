package behavioral.chainofresponsibility;

public class FamilySpirit implements AnomalyHandler {
    @Override
    public boolean canHandleAnomaly(MagicalAnomaly anomaly) {
        return anomaly.getAnomalyType() == AnomalyType.ARK_FRACTURE;
    }

    @Override
    public int getPriority() {
        return 3;
    }

    @Override
    public void handle(MagicalAnomaly anomaly) {
        anomaly.markHandled();
        System.out.println(name() + " використовує свою силу, щоб зупинити: " + anomaly);
    }

    @Override
    public String name() {
        return "Дух родини ковчега";
    }
}