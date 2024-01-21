package goddrinksjava;

import goddrinksjava.attribute.Antioxidants;
import goddrinksjava.attribute.Attributable;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public interface Tomato extends Attributable {
    default Antioxidants getAntioxidants() {
        return (Antioxidants) getAttribute(Antioxidants.class);
    }

    default void resetAntioxidants() {
        resetAttribute(Antioxidants.class);
    }
}
