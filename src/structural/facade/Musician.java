package structural.facade;

import java.util.Arrays;

public abstract class Musician {

    public void restInDressingRoom() {
        System.out.println(name() + " відпочиває в гримерці.");
    }

    public void getReady() {
        System.out.println(name() + " готується до виступу.");
    }

    public void leaveStage() {
        System.out.println(name() + " йде зі сцени під оплески.");
    }

    public void goToStage() {
        System.out.println(name() + " виходить на сцену!");
    }

    private void action(Action action) {
        switch (action) {
            case REST -> restInDressingRoom();
            case GET_READY -> getReady();
            case LEAVE_STAGE -> leaveStage();
            case GO_TO_STAGE -> goToStage();
            case PLAY_MUSIC -> playMusic();
            default -> System.out.println("Невідома дія");
        }
    }

    public void action(Action... actions) {
        Arrays.stream(actions).forEach(this::action);
    }

    public abstract void playMusic();

    public abstract String name();

    public enum Action {
        REST, GET_READY, LEAVE_STAGE, GO_TO_STAGE, PLAY_MUSIC
    }
}