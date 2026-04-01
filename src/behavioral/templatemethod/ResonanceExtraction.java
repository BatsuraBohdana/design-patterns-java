package behavioral.templatemethod;

public class ResonanceExtraction extends MemoryExtractionMethod {

    @Override
    protected String selectArtifact() {
        return "стародавній літопис";
    }

    @Override
    protected void bypassDefenses(String artifact) {
        System.out.println("Ти наближаєшся до об'єкта " + artifact + " і підлаштовуєшся під його вібрації.");
    }

    @Override
    protected void retrieveMemory(String artifact) {
        System.out.println("Перебуваючи в гармонії, обережно витягуєш спогад із об'єкта " + artifact + ".");
    }
}