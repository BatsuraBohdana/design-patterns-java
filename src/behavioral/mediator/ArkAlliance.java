package behavioral.mediator;

import behavioral.mediator.members.ArkResident;

public interface ArkAlliance {

    void addMember(ArkResident member);

    void act(ArkResident actor, ArkEvent action);
}