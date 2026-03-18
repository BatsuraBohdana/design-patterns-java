package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class PackageComponent {

    private final List<PackageComponent> children = new ArrayList<>();

    public void add(PackageComponent component) {
        children.add(component);
    }

    public int count() {
        return children.size();
    }

    protected void printThisBefore() {
    }

    protected void printThisAfter() {
    }

    public void print() {
        printThisBefore();
        children.forEach(PackageComponent::print);
        printThisAfter();
    }
}