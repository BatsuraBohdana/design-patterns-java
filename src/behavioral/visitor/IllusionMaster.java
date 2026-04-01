package behavioral.visitor;

public class IllusionMaster extends ArkEntity {

    public IllusionMaster(ArkEntity... children) {
        super(children);
    }

    @Override
    public void accept(ArkVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "Майстер Ілюзій";
    }
}