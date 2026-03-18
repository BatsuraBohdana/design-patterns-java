package structural.decorator;

public class DdosProtectedHosting implements WebHosting {
    private final WebHosting decorated;

    public DdosProtectedHosting(WebHosting decorated) {
        this.decorated = decorated;
    }

    @Override
    public void handleRequest() {
        decorated.handleRequest();
        System.out.println("Трафік надійно фільтрується системою Anti-DDoS!");
    }

    @Override
    public int getMonthlyCost() {
        return decorated.getMonthlyCost() + 15;
    }

    @Override
    public void stopServer() {
        decorated.stopServer();
    }
}
