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

        // 3. Abstract Factory (Стімпанк проти Кіберпанку)
        System.out.println("\n[Abstract Factory Output]");
        TransportFactory steampunkWorld = new SteampunkFactory();
        System.out.println("--- Генерація стімпанк світу ---");
        steampunkWorld.createCar().drive();
        steampunkWorld.createAircraft().fly();

        TransportFactory cyberpunkWorld = new CyberpunkFactory();
        System.out.println("--- Генерація кіберпанк світу ---");
        cyberpunkWorld.createCar().drive();
        cyberpunkWorld.createAircraft().fly();

        // 4. Builder (Створення RPG Героїв)
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