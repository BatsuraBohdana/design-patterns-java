package behavioral.visitor;

import java.util.Arrays;

public abstract class ArkEntity {

    private final ArkEntity[] children;

    public ArkEntity(ArkEntity... children) {
        this.children = children;
    }

    public void accept(ArkVisitor visitor) {
        Arrays.stream(children).forEach(child -> child.accept(visitor));
    }
}