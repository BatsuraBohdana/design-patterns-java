package structural.flyweight;

public class WillowTree implements Tree{
    @Override
    public void draw() {
        System.out.println("Малюємо плакучу вербу біля води. (Дерево=" + System.identityHashCode(this) + ")");
    }
}
