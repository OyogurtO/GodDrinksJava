package goddrinksjava;

import goddrinksjava.attribute.Dimensions;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public interface PointSet extends Thing {

    default Dimensions getDimensions() {
        return (Dimensions) getAttribute(Dimensions.class);
    }

    default void resetDimensions() {
        resetAttribute(Dimensions.class);
    }
}
