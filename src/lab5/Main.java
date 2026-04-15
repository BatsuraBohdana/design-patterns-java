package lab5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

class ArkTraveler {
    private Runnable strategy;
    public ArkTraveler(Runnable strategy) { this.strategy = strategy; }
    public void changeStrategy(Runnable strategy) { this.strategy = strategy; }
    public void startJourney() { strategy.run(); }
}

interface Artifact { void activate(); }
class SunMirror implements Artifact {
    public void activate() { System.out.println("Дзеркало спалахує сонячним світлом!"); }
}
class ShadowDagger implements Artifact {
    public void activate() { System.out.println("Кинджал поглинає світло навколо."); }
}

interface MagicForge {
    Artifact createArtifact(); // Factory Method
    default void orderArtifact() {
        System.out.println("Кузня починає магічний процес...");
        createArtifact().activate();
        System.out.println("Артефакт виковано.");
    }
}

record EnchantedService(Runnable action, int power) {}

class SpellService {
    private final Function<EnchantedService, EnchantedService> combinedDecorator;

    @SafeVarargs
    public SpellService(Function<EnchantedService, EnchantedService>... decorators) {
        this.combinedDecorator = Stream.of(decorators)
                .reduce(Function.identity(), Function::andThen);
    }

    public void cast(Runnable baseSpell, int basePower) {
        EnchantedService result = combinedDecorator.apply(new EnchantedService(baseSpell, basePower));
        result.action().run();
        System.out.println("Підсумкова магічна потужність: " + result.power());
    }
}
class ForbiddenGrimoire {
    private ForbiddenGrimoire() { System.out.println("Книга 'Тіні' відкрита."); }
    public static void access(Consumer<ForbiddenGrimoire> block) {
        ForbiddenGrimoire grimoire = new ForbiddenGrimoire();
        try {
            block.accept(grimoire);
        } finally {
            System.out.println("Книга безпечно зачинена.");
        }
    }
    public void read() { System.out.println("Вивчаємо таємне закляття..."); }
}

public class Main {
    public static void main(String[] args) {

        System.out.println(" ПАТЕРН СТРАТЕГІЯ ");
        ArkTraveler traveler = new ArkTraveler(() -> System.out.println("Політ на дирижаблі!"));
        traveler.startJourney();
        traveler.changeStrategy(() -> System.out.println("Прохід крізь дзеркало!"));
        traveler.startJourney();

        System.out.println("\n ПАТЕРН ФАБРИЧНИЙ МЕТОД ");
        // Виправлено: використано Method Reference для чистоти коду
        MagicForge sunForge = SunMirror::new;
        sunForge.orderArtifact();
        MagicForge shadowForge = ShadowDagger::new;
        shadowForge.orderArtifact();

        System.out.println("\n  ПАТЕРН ДЕКОРАТОР ");
        Function<EnchantedService, EnchantedService> fireAspect = s -> new EnchantedService(
                () -> { s.action().run(); System.out.println("Додано ефект вогню!"); },
                s.power() + 50
        );
        Function<EnchantedService, EnchantedService> iceAspect = s -> new EnchantedService(
                () -> { s.action().run(); System.out.println("❄Додано ефект льоду!"); },
                s.power() + 30
        );

        SpellService spell = new SpellService(fireAspect, iceAspect);
        spell.cast(() -> System.out.println("Випуск базової магії"), 100);

        System.out.println("\n ПАТЕРН НАВКОЛИШНЄ ВИКОНАННЯ ");
        ForbiddenGrimoire.access(ForbiddenGrimoire::read);
    }
}