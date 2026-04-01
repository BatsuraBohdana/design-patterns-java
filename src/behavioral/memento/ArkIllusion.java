package behavioral.memento;

public class ArkIllusion {

    private IllusionState state;
    private int timeExisted;
    private int distortionLevel;

    public ArkIllusion(IllusionState startState, int startTime, int startDistortion) {
        this.state = startState;
        this.timeExisted = startTime;
        this.distortionLevel = startDistortion;
    }

    public void timePasses() {
        timeExisted *= 2;
        distortionLevel *= 8;
        switch (state) {
            case FLICKERING -> state = IllusionState.FADING;
            case PERFECT -> state = IllusionState.FLICKERING;
            case SHATTERED -> state = IllusionState.DISPELLED;
            case FADING -> state = IllusionState.SHATTERED;
            case DISPELLED -> {
                timeExisted *= 2;
                distortionLevel = 0;
            }
            default -> {
            }
        }
    }

    public IllusionMemento getMemento() {
        return new IllusionMementoInternal(state, timeExisted, distortionLevel);
    }

    public void setMemento(IllusionMemento memento) {
        var state = (IllusionMementoInternal) memento;
        this.state = state.state();
        this.timeExisted = state.timeExisted();
        this.distortionLevel = state.distortionLevel();
    }

    @Override
    public String toString() {
        return String.format("%s час існування: %d годин рівень спотворення: %d", state.getType(), timeExisted, distortionLevel);
    }

    private record IllusionMementoInternal(IllusionState state, int timeExisted, int distortionLevel) implements IllusionMemento {

    }
}