package behavioral.state;

public class DormantState implements State {

    private final ArkGuardian guardian;

    public DormantState(ArkGuardian guardian) {
        this.guardian = guardian;
    }

    @Override
    public void observe() {
        System.out.println(guardian + " мирно спить, зливаючись з архітектурою ковчега.");
    }

    @Override
    public void onEnterState() {
        System.out.println(guardian + " заспокоюється і перетворюється на кам'яну статую.");
    }
}