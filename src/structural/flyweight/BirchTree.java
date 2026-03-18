package structural.flyweight;

public class BirchTree implements Tree{
    @Override
    public void draw() {
        System.out.println("Малюємо тонку світлу березу. (Дерево=" + System.identityHashCode(this) + ")");
    }
}
