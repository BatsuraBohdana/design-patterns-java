package structural.composite;

import java.util.List;

public class PostOffice {

    public PackageComponent createTechParcel() {
        var boxes = List.of(
                new SmallBox("Телефон", "Чохол"),
                new SmallBox("Навушники", "Зарядне")
        );
        return new BigParcel(boxes);
    }
}
