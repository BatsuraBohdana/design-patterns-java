package creational.factory;

public class ExcelCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}