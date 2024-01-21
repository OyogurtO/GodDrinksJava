package goddrinksjava;

import goddrinksjava.attribute.Pose;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public abstract class AbstractMovableThing extends AbstractAttributableThing {
    public Pose pose;

    public double getXPosition() {
        return pose.x;
    }

    public void addAction(String type, Pose pose) {
        log("set ACTION='"+type+"'");
    }
}
