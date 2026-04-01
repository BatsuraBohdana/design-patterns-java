package behavioral.visitor;

public interface ArkVisitor {

    void visit(NoviceSpirit spirit);

    void visit(IllusionMaster master);

    void visit(HighAnimist animist);
}