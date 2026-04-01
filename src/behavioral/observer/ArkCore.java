package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ArkCore {

    private ResonanceType currentResonance;

    private final List<ResonanceObserver> observers;

    public ArkCore() {
        observers = new ArrayList<>();
        currentResonance = ResonanceType.STABLE;
    }

    public void addObserver(ResonanceObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(ResonanceObserver obs) {
        observers.remove(obs);
    }

    public void timePasses() {
        var enumValues = ResonanceType.values();
        currentResonance = enumValues[(currentResonance.ordinal() + 1) % enumValues.length];
        System.out.println("Резонанс ядра змінився на " + currentResonance.description + ".");
        notifyObservers();
    }

    private void notifyObservers() {
        for (var obs : observers) {
            obs.update(currentResonance);
        }
    }
}