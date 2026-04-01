package  behavioral.chainofresponsibility;

public interface AnomalyHandler {

    boolean canHandleAnomaly(MagicalAnomaly anomaly);

    int getPriority();

    void handle(MagicalAnomaly anomaly);

    String name();
}