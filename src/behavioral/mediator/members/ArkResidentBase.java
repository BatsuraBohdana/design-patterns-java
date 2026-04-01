package behavioral.mediator.members;

import behavioral.mediator.ArkEvent;
import behavioral.mediator.ArkAlliance;

public abstract class ArkResidentBase implements ArkResident {

    protected ArkAlliance alliance;

    @Override
    public void joinedAlliance(ArkAlliance alliance) {
        System.out.println(this + " приєднується до альянсу ковчега");
        this.alliance = alliance;
    }

    @Override
    public void allianceAction(ArkEvent action) {
        System.out.println(this + " " + action.getDescription());
    }

    @Override
    public void act(ArkEvent action) {
        if (alliance != null) {
            System.out.println(this + " " + action);
            alliance.act(this, action);
        }
    }

    @Override
    public abstract String toString();
}