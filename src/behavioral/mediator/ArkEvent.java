package behavioral.mediator;

public enum ArkEvent {

    ILLUSION_CAST("створює грандіозну ілюзію", "захоплено спостерігає за міражем"),
    MEMORY_READ("зчитує пам'ять стародавнього предмета", "прислухається до відлуння минулого"),
    RESOURCE_FOUND("знаходить поклади зоряного піску", "збирає свою частину піску"),
    SPACE_FRACTURE("помічає просторовий розрив", "готується до захисту ковчега"),
    NONE("", "");

    private final String title;
    private final String description;

    ArkEvent(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return title;
    }
}