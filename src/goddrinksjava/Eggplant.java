package goddrinksjava;

import goddrinksjava.attribute.Attributable;
import goddrinksjava.attribute.Nutrients;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public interface Eggplant extends Attributable {
    default Nutrients getNutrients() {
        return (Nutrients) getAttribute(Nutrients.class);
    }
    default void resetNutrients() {
        resetAttribute(Nutrients.class);
    }
}
