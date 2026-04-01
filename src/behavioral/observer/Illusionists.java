package behavioral.observer;

public class Illusionists implements ResonanceObserver {

    @Override
    public void update(ResonanceType currentResonance) {
        System.out.println("Ілюзіоністи зараз відчувають " + currentResonance.description + " магічний фон");
    }
}