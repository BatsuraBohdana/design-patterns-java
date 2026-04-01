package behavioral.chainofresponsibility;

import java.util.Objects;

public class MagicalAnomaly {
    private final AnomalyType anomalyType;
    private final String description;
    private boolean handled;

    public MagicalAnomaly(AnomalyType anomalyType, String description) {
        this.anomalyType = Objects.requireNonNull(anomalyType);
        this.description = Objects.requireNonNull(description);
    }

    public String getDescription() { return description; }

    public AnomalyType getAnomalyType() { return anomalyType; }

    public void markHandled() { this.handled = true; }

    public boolean isHandled() { return this.handled; }

    @Override
    public String toString() { return getDescription(); }
}