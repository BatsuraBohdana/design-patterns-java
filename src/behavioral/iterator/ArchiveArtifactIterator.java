package behavioral.iterator;

public class ArchiveArtifactIterator implements Iterator<MagicalArtifact> {

    private final BabelArchive archive;
    private int idx;
    private final ArtifactType type;

    public ArchiveArtifactIterator(BabelArchive archive, ArtifactType type) {
        this.archive = archive;
        this.type = type;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    @Override
    public MagicalArtifact next() {
        idx = findNextIdx();
        if (idx != -1) {
            return archive.artifacts().get(idx);
        }
        return null;
    }

    private int findNextIdx() {
        var artifacts = archive.artifacts();
        var tempIdx = idx;
        while (true) {
            tempIdx++;
            if (tempIdx >= artifacts.size()) {
                tempIdx = -1;
                break;
            }
            if (type.equals(ArtifactType.ANY) || artifacts.get(tempIdx).getType().equals(type)) {
                break;
            }
        }
        return tempIdx;
    }
}