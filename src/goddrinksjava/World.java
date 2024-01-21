package goddrinksjava;

import goddrinksjava.attribute.Name;

import java.util.ArrayList;
import java.util.List;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public class World extends AbstractAttributableThing {
    public List<Thing> things = new ArrayList<>();
    public Thing god;

    public World(int i) {
        addAttribute(new Name("WORLD"));
    }

    void addThing(Thing thing) {
        things.add(thing);
        log("ADD " + thing.getNameRef());
        if (god == null) {
            god = thing;
        }
    }

    void removeThing(Thing thing) {
        things.remove(thing);
        log("DEL " + thing.getNameRef());
    }

    int getThingIndex(Thing thing) {
        int index = things.indexOf(thing);
        if (index < 0) {
            log("CAN NOT FIND " + thing.getNameRef() + "!");
        }
        return index;
    }

    public Thing getGod() {
        return god;
    }

    void startSimulation() {
        log("START...");
    }

    void timeTravel(String period, int year, Thing t1) {
        t1.log("traveled to " + period + year);
    }

    void timeTravelForTwo(String period, int year, Thing t1, Thing t2) {
        timeTravel(period, year, t1);
        timeTravel(period, year, t2);
    }

    void lockThing(Thing thing) {
        log("LOCK " + thing.getNameRef());
    }

    void unlock(Thing thing) {
        log("UNLOCK " + thing.getNameRef());
    }

    void unite(Lovable t1, Lovable t2) {
        log(t1.getNameRef() + " UNITE " + t2.getNameRef());
    }

    void procreate(Lovable l1, Lovable l2) {
        procreate0(l1, l2);
        procreate0(l2, l1);
    }

    void makeHigh(Lovable lovable) {
        lovable.log("make high!");
    }

    private void procreate0(Lovable l1, Lovable l2) {
        if (l1.gender && !l2.gender) {
            l2.log("procreated!");
        }
    }

    void runExecution() {
        log("EXECUTION");
    }

    void execute(Thing thing) {
        things.remove(thing);
        log("EXECUTE " + thing.getNameRef());
    }

    boolean isExecutableBy(Thing thing) {
        return true;
    }

    void announce(String val) {
        log(val);
    }

    void announce(String val, String locale) {
        // locale translation unsupported
        log(val + " (" + locale.toUpperCase() + ")");
    }

    @Override
    public String toString() {
        return getNameRef();
    }
}
