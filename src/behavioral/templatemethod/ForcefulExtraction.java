package behavioral.templatemethod;

public class ForcefulExtraction extends MemoryExtractionMethod {

    @Override
    protected String selectArtifact() {
        return "дзеркало ілюзій";
    }

    @Override
    protected void bypassDefenses(String artifact) {
        System.out.println("Ти підходиш до об'єкта " + artifact + " і різко розбиваєш зовнішній шар магії!");
    }

    @Override
    protected void retrieveMemory(String artifact) {
        System.out.println("Швидко хапаєш відлуння спогаду, поки захист не відновився!");
    }
}