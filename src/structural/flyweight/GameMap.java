package structural.flyweight;

import java.util.List;

public class GameMap {
    private final List<Tree> northForest;
    private final List<Tree> southForest;

    public GameMap(List<Tree> northForest, List<Tree> southForest) {
        this.northForest = northForest;
        this.southForest = southForest;
    }

    public final List<Tree> getNorthForest() {
        return List.copyOf(this.northForest);
    }

    public final List<Tree> getSouthForest() {
        return List.copyOf(this.southForest);
    }

    public void renderMap() {
        System.out.println("--- Рендеринг Північного лісу ---");
        northForest.forEach(Tree::draw);
        System.out.println("--- Рендеринг Південного лісу ---");
        southForest.forEach(Tree::draw);
    }
}
