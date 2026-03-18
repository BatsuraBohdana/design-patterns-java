package structural.composite;

import java.util.List;

public class SmallBox extends PackageComponent {

    public SmallBox(List<Product> products) {
        for (Product p : products) {
            this.add(p);
        }
    }
    public SmallBox(String... productNames) {
        for (String name : productNames) {
            this.add(new Product(name));
        }
    }
    @Override
    protected void printThisBefore() {
        System.out.print("[Відкрили малу коробку: ");
    }

    @Override
    protected void printThisAfter() {
        System.out.print("] ");
    }
}
