package behavioral.observer;

public class FamilySpirits implements ResonanceObserver {

    @Override
    public void update(ResonanceType currentResonance) {
        System.out.println("Духи родини реагують на " + currentResonance.description + " стан ковчега");
    }
}