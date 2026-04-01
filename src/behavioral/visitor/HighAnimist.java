package behavioral.visitor;

public class HighAnimist extends ArkEntity {

    public HighAnimist(ArkEntity... children) {
        super(children);
    }

    @Override
    public void accept(ArkVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Верховний Аніміст";
    }
}