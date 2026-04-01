package behavioral.chainofresponsibility;

import java.util.Comparator;
import java.util.List;

public class ArkCouncil {

    private final List<AnomalyHandler> handlers;

    public ArkCouncil(List<AnomalyHandler> handlers) {
        this.handlers = handlers;
    }

    public void resolveAnomaly(MagicalAnomaly anomaly) {
        handlers.stream()
                .sorted(Comparator.comparing(AnomalyHandler::getPriority))
                .filter(handler -> handler.canHandleAnomaly(anomaly))
                .findFirst()
                .ifPresent(handler -> handler.handle(anomaly));
    }
}