package behavioral.templatemethod;

public abstract class MemoryExtractionMethod {

    protected abstract String selectArtifact();

    protected abstract void bypassDefenses(String artifact);

    protected abstract void retrieveMemory(String artifact);

    public final void extract() {
        var artifact = selectArtifact();
        System.out.println("Об'єктом для зчитування обрано " + artifact + ".");
        bypassDefenses(artifact);
        retrieveMemory(artifact);
    }
}