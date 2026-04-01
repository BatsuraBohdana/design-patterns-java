package behavioral.state;

public class WrathfulState implements State {

    private final ArkGuardian guardian;

    public WrathfulState(ArkGuardian guardian) {
        this.guardian = guardian;
    }

    @Override
    public void observe() {
        System.out.println(guardian + " випромінює руйнівну магію та готовий нищити ворогів!");
    }

    @Override
    public void onEnterState() {
        System.out.println(guardian + " різко пробуджується в гніві!");
    }
}