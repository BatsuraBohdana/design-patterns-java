package structural.decorator;

public class BasicHosting implements WebHosting{
    @Override
    public void handleRequest() {
        System.out.println("Обслуговування веб-сайту CyberNest на спільному базовому сервері!");
    }

    @Override
    public int getMonthlyCost() {
        return 10;
    }

    @Override
    public void stopServer() {
        System.out.println("Базовий сервер коректно завершує роботу.");
    }
}
