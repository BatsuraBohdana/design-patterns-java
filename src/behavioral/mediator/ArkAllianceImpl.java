package behavioral.mediator;

import behavioral.mediator.members.ArkResident;

import java.util.ArrayList;
import java.util.List;

public class ArkAllianceImpl implements ArkAlliance {

    private final List<ArkResident> members;

    public ArkAllianceImpl() {
        members = new ArrayList<>();
    }

    @Override
    public void act(ArkResident actor, ArkEvent action) {
        for (var member : members) {
            if (!member.equals(actor)) {
                member.allianceAction(action);
            }
        }
    }

    @Override
    public void addMember(ArkResident member) {
        members.add(member);
        member.joinedAlliance(this);
    }
}