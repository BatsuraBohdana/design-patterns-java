package structural;

import java.util.List;

import structural.adapter.*;
import structural.bridge.*;
import structural.composite.*;
import structural.decorator.*;
import structural.flyweight.*;
import structural.proxy.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("1. ADAPTER - Інтеграція Telegram");
        Notification notification = new TelegramAdapter();
        SystemAlert alert = new SystemAlert(notification);
        alert.alertAdmin();

        System.out.println("2. BRIDGE - Сторінки сайту та Теми");
        Theme darkTheme = new DarkTheme();
        WebPage myHomePage = new HomePage(darkTheme);
        myHomePage.load();
        myHomePage.interact();
        myHomePage.close();

        System.out.println("3. COMPOSITE - Посилка та Коробки");
        PostOffice postOffice = new PostOffice();
        PackageComponent myParcel = postOffice.createTechParcel();
        myParcel.print();

        System.out.println("4. DECORATOR - Захист Сервера");
        WebHosting basicServer = new BasicHosting();
        System.out.println("Базова ціна: $" + basicServer.getMonthlyCost());

        WebHosting protectedServer = new DdosProtectedHosting(basicServer);
        protectedServer.handleRequest();
        System.out.println("Ціна із захистом: $" + protectedServer.getMonthlyCost());

        System.out.println("5. FLYWEIGHT - Дерева в грі");
        TreeFactory treeFactory = new TreeFactory();

        List<Tree> northForest = List.of(
                treeFactory.createTree(TreeType.OAK),
                treeFactory.createTree(TreeType.OAK),
                treeFactory.createTree(TreeType.PINE)
        );
        List<Tree> southForest = List.of(
                treeFactory.createTree(TreeType.WILLOW),
                treeFactory.createTree(TreeType.OAK)
        );

        GameMap gameMap = new GameMap(northForest, southForest);
        gameMap.renderMap();

        System.out.println("6. PROXY - Шлагбаум на парковці");
        ParkingLot parking = new ParkingBarrierProxy(new CityParkingLot());

        parking.enter(new Car("CE1111AA"));
        parking.enter(new Car("CE2222BB"));
        parking.enter(new Car("CE3333CC"));
        parking.enter(new Car("CE4444DD"));
        parking.enter(new Car("CE5555EE"));
    }
}
