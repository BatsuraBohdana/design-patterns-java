package structural.composite;

public class Product extends PackageComponent {

    private final String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(name + " ");
    }
}
