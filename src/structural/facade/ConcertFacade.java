package structural.facade;
import java.util.List;

public class ConcertFacade {
    private final List<Musician> band;

    public ConcertFacade() {
        band = List.of(
                new Drummer(),
                new Guitarist(),
                new Vocalist()
        );
    }

    public void startShow() {
        System.out.println("\n--- ОРГАНІЗАТОР: Починаємо шоу! ---");
        makeActions(band, Musician.Action.GET_READY, Musician.Action.GO_TO_STAGE);
    }

    public void playHitSong() {
        System.out.println("\n--- ОРГАНІЗАТОР: Граємо головний хіт! ---");
        makeActions(band, Musician.Action.PLAY_MUSIC);
    }

    public void endShow() {
        System.out.println("\n--- ОРГАНІЗАТОР: Концерт закінчено! ---");
        makeActions(band, Musician.Action.LEAVE_STAGE, Musician.Action.REST);
    }

    private static void makeActions(
            List<Musician> musicians,
            Musician.Action... actions
    ) {
        musicians.forEach(musician -> musician.action(actions));
    }
}