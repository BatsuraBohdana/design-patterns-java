package creational.abstractfactory;

// Ніяких import creational.prototype.Car; тут бути не повинно!

public class SteamCar implements Car {
    @Override
    public void drive() {
        System.out.println(" Стім-мобіль гуркоче бруківкою, випускаючи хмари пари.");
    }
}