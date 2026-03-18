package creational;

import creational.singleton.*;
import creational.factory.*;
import creational.abstractfactory.*;
import creational.builder.*;
import creational.prototype.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== РЕЗУЛЬТАТ РОБОТИ ПАТЕРНІВ ===\n");

        // 1. Singleton
        System.out.println("[Singleton Output]");
        DatabaseConnection.getInstance().query("SELECT * FROM students");

        // 2. Factory Method (Документи)
        System.out.println("\n[Factory Method Output]");
        new PDFCreator().createDocument().open();
        new WordCreator().createDocument().open();

        // 3. abstractfactory
        System.out.println("[Abstract Factory Output]");

        TransportType type = TransportType.STEAMPUNK;

        TransportFactory factory = TransportFleet.FactoryMaker.makeFactory(type);

        TransportFleet fleet = new TransportFleet(
                factory.createCar(),
                factory.createAircraft()
        );

        // 4. Builder
        System.out.println("--- Генерація світу: " + type + " ---");
        fleet.car().drive();
        fleet.aircraft().fly();
        System.out.println("\n[Builder Output]");
        Hero paladin = new Hero.HeroBuilder("Артес", "Паладин")
                .withWeapon("Святий меч")
                .withArmor("Важка пластінчаста броня")
                .withMount("Бойовий кінь")
                .build();
        paladin.showStats();

        System.out.println();

        Hero mage = new Hero.HeroBuilder("Кріон", "Маг")
                .withWeapon("Посох льоду")
                .build();
        mage.showStats();

        // 5. Prototype
        System.out.println("\n[Prototype Output]");
        creational.prototype.Car tesla = new creational.prototype.Car("Tesla Model S");
        creational.prototype.Car clone = (creational.prototype.Car) tesla.doClone();
        clone.drive();
    }
}