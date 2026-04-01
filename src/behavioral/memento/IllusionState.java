package behavioral.memento;

public enum IllusionState {

    PERFECT("Ідеальна ілюзія"),
    FLICKERING("Мерехтлива ілюзія"),
    FADING("Згасаюча ілюзія"),
    SHATTERED("Розбита ілюзія"),
    DISPELLED("Розвіяна ілюзія");

    private final String type;

    IllusionState(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}