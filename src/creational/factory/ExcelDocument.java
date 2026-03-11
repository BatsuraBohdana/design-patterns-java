package creational.factory;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("--- Factory Method: Excel документ відкрито ---");
    }
}