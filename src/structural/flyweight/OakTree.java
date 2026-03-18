package structural.flyweight;

public class OakTree implements Tree{
    @Override
    public void draw() {
        System.out.println("Малюємо великий міцний дуб. (Дерево=" + System.identityHashCode(this) + ")");
    }
}
