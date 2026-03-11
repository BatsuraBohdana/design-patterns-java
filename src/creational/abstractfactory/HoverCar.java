package creational.abstractfactory;

public class HoverCar implements Car {
    @Override
    public void drive() {
        System.out.println(" Гравікар безшумно ковзає над неоновими вулицями.");
    }
}