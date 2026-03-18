package structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

public class TreeFactory {
    private final Map<TreeType, Tree> trees;

    public TreeFactory() {
        trees = new EnumMap<>(TreeType.class);
    }

    public Tree createTree(TreeType type) {
        var tree = trees.get(type);
        if (tree == null) {
            switch (type) {
                case OAK -> tree = new OakTree();
                case PINE -> tree = new PineTree();
                case BIRCH -> tree = new BirchTree();
                case MAPLE -> tree = new MapleTree();
                case WILLOW -> tree = new WillowTree();
                default -> {
                }
            }
            if (tree != null) {
                trees.put(type, tree);
            }
        }
        return tree;
    }
}
