package goddrinksjava.attribute;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public class Pose {
    public double x;
    public double y;
    public double theta;

    public Pose(double x, double y, double theta) {
        this.x = x;
        this.y = y;
        this.theta = theta;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + Math.toDegrees(theta) + ")";
    }
}
