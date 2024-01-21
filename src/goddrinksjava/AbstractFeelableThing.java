package goddrinksjava;

import java.util.ArrayList;
import java.util.List;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public abstract class AbstractFeelableThing extends AbstractMovableThing {
    List<String> feelings = new ArrayList<>();
    Thing satisfaction;

    public void addFeeling(String feeling) {
        feelings.add(feeling);
        log("feel " + feeling + "!");
    }

    public void removeFeeling(String feeling) {
        feelings.remove(feeling);
        log("del '" + feeling + "'");
    }

    public int getFeelingIndex(String feeling) {
        return feelings.indexOf(feeling);
    }

    public void canSee(boolean state) {
        log("set canSee=" + state);
    }

    public int getNumStimulationsAvailable() {
        return 0;
    }

    public int getNumStimulationsNeeded() {
        return 0;
    }

    public Thing toSatisfaction() {
        return this;
    }

    public void setSatisfaction(Thing thing) {
        satisfaction = thing;
        addFeeling("happy");
    }
}
