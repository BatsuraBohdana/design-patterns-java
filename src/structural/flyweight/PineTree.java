package structural.flyweight;

public class PineTree implements Tree{
    @Override
    public void draw() {
        System.out.println("Малюємо високу зелену сосну. (Дерево=" + System.identityHashCode(this) + ")");
    }
}
