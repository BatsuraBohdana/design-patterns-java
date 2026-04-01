package behavioral.templatemethod;

public class MemorySeeker {

    private MemoryExtractionMethod extractionMethod;

    public MemorySeeker(MemoryExtractionMethod extractionMethod) {
        this.extractionMethod = extractionMethod;
    }

    public void extract() {
        extractionMethod.extract();
    }

    public void changeMethod(MemoryExtractionMethod extractionMethod) {
        this.extractionMethod = extractionMethod;
    }
}