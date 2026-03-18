package structural.composite;
import java.util.List;

public class BigParcel extends PackageComponent {

    public BigParcel(List<SmallBox> boxes) {
        for(SmallBox box : boxes) {
            this.add(box);
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.println("{  ВЕЛИКА ПОСИЛКА }");
    }

    @Override
    protected void printThisAfter() {
        System.out.println("\n{ КІНЕЦЬ ПОСИЛКИ }");
    }
}