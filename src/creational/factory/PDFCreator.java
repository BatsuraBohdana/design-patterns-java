package creational.factory;

public class PDFCreator extends DocumentCreator {
    public Document createDocument() { return new PDFDocument(); }
}