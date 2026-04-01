package behavioral.visitor;

public class NoviceSpiritVisitor implements ArkVisitor {

    @Override
    public void visit(NoviceSpirit spirit) {
        System.out.println("Привіт, " + spirit);
    }

    @Override
    public void visit(IllusionMaster master) {
        System.out.println("=======");
    }

    @Override
    public void visit(HighAnimist animist) {
        System.out.println("------");
    }
}