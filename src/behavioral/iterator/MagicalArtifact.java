package behavioral.iterator;

public class MagicalArtifact {

    private ArtifactType type;
    private final String name;

    public MagicalArtifact(ArtifactType type, String name) {
        this.setType(type);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public ArtifactType getType() {
        return type;
    }

    public final void setType(ArtifactType type) {
        this.type = type;
    }
}