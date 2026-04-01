package behavioral.state;

public class ArkGuardian {

    private State state;

    public ArkGuardian() {
        state = new DormantState(this);
    }

    public void timePasses() {
        if (state.getClass().equals(DormantState.class)) {
            changeStateTo(new WrathfulState(this));
        } else {
            changeStateTo(new DormantState(this));
        }
    }

    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    @Override
    public String toString() {
        return "Вартовий Ковчега";
    }

    public void observe() {
        this.state.observe();
    }
}