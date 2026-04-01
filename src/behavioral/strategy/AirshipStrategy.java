package behavioral.strategy;

public class AirshipStrategy implements ArkTraversalStrategy {

    @Override
    public void execute() {
        System.out.println("Ти підіймаєшся на борт ефірного дирижабля і безпечно перетинаєш просторову прірву!");
    }
}