package behavioral.observer;

public enum ResonanceType {
    STABLE("стабільний"),
    DISTORTED("спотворений"),
    FRACTURED("розірваний");

    public final String description;

    ResonanceType(String description) {
        this.description = description;
    }
}