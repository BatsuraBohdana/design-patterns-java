package behavioral;

import behavioral.chainofresponsibility.*;
import behavioral.command.*;
import behavioral.iterator.*;
import behavioral.mediator.*;
import behavioral.mediator.members.*;
import behavioral.memento.*;
import behavioral.observer.*;
import behavioral.state.*;
import behavioral.strategy.*;
import behavioral.templatemethod.*;
import behavioral.visitor.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(" CHAIN OF RESPONSIBILITY ");
        AnomalyHandler novice = new NoviceIllusionist();
        AnomalyHandler reader = new ObjectReader();
        behavioral.chainofresponsibility.FamilySpirit spirit1 = new behavioral.chainofresponsibility.FamilySpirit();
        ArkCouncil council = new ArkCouncil(List.of(novice, reader, spirit1));
        council.resolveAnomaly(new MagicalAnomaly(AnomalyType.MINOR_ILLUSION, "Фантомний метелик у коридорі"));
        council.resolveAnomaly(new MagicalAnomaly(AnomalyType.MEMORY_ECHO, "Старе дзеркало транслює минуле"));
        council.resolveAnomaly(new MagicalAnomaly(AnomalyType.ARK_FRACTURE, "Просторова тріщина на краю"));

        System.out.println("\n COMMAND ");
        MirrorPortal portal = new MirrorPortal();
        Command traverse = new TraverseMirrorCommand(portal);
        MemoryObject memory = new MemoryObject();
        Command read = new ReadMemoryCommand(memory);
        AnimistInvoker invoker = new AnimistInvoker(traverse);
        invoker.invoke();
        invoker.setCommand(read);
        invoker.invoke();

        System.out.println("\n ITERATOR ");
        BabelArchive archive = new BabelArchive(List.of(
                new MagicalArtifact(ArtifactType.MEMORY_OBJECT, "Камінь Спогадів"),
                new MagicalArtifact(ArtifactType.ILLUSION_WEB, "Сітка Міражів"),
                new MagicalArtifact(ArtifactType.ANCIENT_MIRROR, "Дзеркало Вавилона"),
                new MagicalArtifact(ArtifactType.MEMORY_OBJECT, "Щоденник Аніміста")
        ));
        behavioral.iterator.Iterator<MagicalArtifact> memoryIterator = archive.iterator(ArtifactType.MEMORY_OBJECT);
        while (memoryIterator.hasNext()) {
            System.out.println(memoryIterator.next());
        }

        System.out.println("\n MEDIATOR ");
        ArkAlliance alliance = new ArkAllianceImpl();
        ArkResident illusionist = new Illusionist();
        ArkResident animist = new Animist();
        behavioral.mediator.members.FamilySpirit spirit2 = new behavioral.mediator.members.FamilySpirit();
        ArkResident chronicler = new Chronicler();
        alliance.addMember(illusionist);
        alliance.addMember(animist);
        alliance.addMember(spirit2);
        alliance.addMember(chronicler);
        illusionist.act(ArkEvent.ILLUSION_CAST);
        animist.act(ArkEvent.MEMORY_READ);

        System.out.println("\n MEMENTO ");
        ArkIllusion illusion = new ArkIllusion(IllusionState.PERFECT, 1, 1);
        System.out.println(illusion);
        IllusionMemento memento = illusion.getMemento();
        illusion.timePasses();
        System.out.println(illusion);
        illusion.setMemento(memento);
        System.out.println(illusion);

        System.out.println("\n OBSERVER ");
        ArkCore core = new ArkCore();
        core.addObserver(new Illusionists());
        core.addObserver(new FamilySpirits());
        core.timePasses();
        core.timePasses();

        System.out.println("\n STATE ");
        ArkGuardian guardian = new ArkGuardian();
        guardian.observe();
        guardian.timePasses();
        guardian.observe();
        guardian.timePasses();
        guardian.observe();

        System.out.println("\n STRATEGY ");
        ArkTraveler traveler = new ArkTraveler(new MirrorPortalStrategy());
        traveler.startJourney();
        traveler.changeStrategy(new AirshipStrategy());
        traveler.startJourney();
        traveler.changeStrategy(new SpiritWalkStrategy());
        traveler.startJourney();

        System.out.println("\n TEMPLATE METHOD ");
        MemorySeeker seeker = new MemorySeeker(new ForcefulExtraction());
        seeker.extract();
        seeker.changeMethod(new ResonanceExtraction());
        seeker.extract();

        System.out.println("\n VISITOR ");
        ArkEntity hierarchy = new HighAnimist(
                new IllusionMaster(new NoviceSpirit(), new NoviceSpirit()),
                new NoviceSpirit()
        );
        hierarchy.accept(new HighAnimistVisitor());
        hierarchy.accept(new IllusionMasterVisitor());
        hierarchy.accept(new NoviceSpiritVisitor());
    }
}