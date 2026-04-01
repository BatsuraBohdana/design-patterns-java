package behavioral.mediator.members;

import behavioral.mediator.ArkEvent;
import behavioral.mediator.ArkAlliance;

public interface ArkResident {

    void joinedAlliance(ArkAlliance alliance);

    void allianceAction(ArkEvent action);

    void act(ArkEvent action);
}