package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public record BabelArchive(List<MagicalArtifact> artifacts) {

    public Iterator<MagicalArtifact> iterator(ArtifactType artifactType) {
        return new ArchiveArtifactIterator(this, artifactType);
    }

    @Override
    public List<MagicalArtifact> artifacts() {
        return new ArrayList<>(artifacts);
    }
}