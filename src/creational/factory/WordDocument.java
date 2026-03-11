package creational.factory;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("--- Factory Method: Word документ відкрито ---");
    }
}