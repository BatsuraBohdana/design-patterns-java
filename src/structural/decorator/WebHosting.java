package structural.decorator;

public interface WebHosting {
    void handleRequest();

    int getMonthlyCost();

    void stopServer();
}
