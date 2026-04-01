package behavioral.strategy;

public class MirrorPortalStrategy implements ArkTraversalStrategy {

    @Override
    public void execute() {
        System.out.println("Ти проходиш крізь старовинне дзеркало Вавилона, миттєво опиняючись на іншому ковчезі!");
    }
}