package behavioral.visitor;

public class IllusionMasterVisitor implements ArkVisitor {

    @Override
    public void visit(NoviceSpirit spirit) {
        System.out.println("*******");
    }

    @Override
    public void visit(IllusionMaster master) {
        System.out.println("Вітаю, " + master);
    }

    @Override
    public void visit(HighAnimist animist) {
        System.out.println("------");
    }
}