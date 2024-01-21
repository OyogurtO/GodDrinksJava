package goddrinksjava;

import goddrinksjava.attribute.Pose;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public interface SineWave extends Thing {
    default Pose getTangent(double x) {
        double theta = Math.atan(Math.cos(x));
        return new Pose(x, Math.sin(x), theta);
    }
}
