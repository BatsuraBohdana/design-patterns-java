package behavioral.strategy;

public class SpiritWalkStrategy implements ArkTraversalStrategy {

    @Override
    public void execute() {
        System.out.println("Духи родини підхоплюють тебе, і ти перелітаєш крізь розлам у вигляді безтілесної тіні!");
    }
}