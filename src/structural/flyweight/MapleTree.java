package structural.flyweight;

public class MapleTree implements Tree{
    @Override
    public void draw() {
        System.out.println("Малюємо клен із червоним листям. (Дерево=" + System.identityHashCode(this) + ")");
    }
}
