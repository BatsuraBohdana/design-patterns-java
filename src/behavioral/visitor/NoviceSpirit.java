package behavioral.visitor;

public class NoviceSpirit extends ArkEntity {

    public NoviceSpirit(ArkEntity... children) {
        super(children);
    }

    @Override
    public void accept(ArkVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Дух-новачок";
    }
}