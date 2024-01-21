package goddrinksjava;

import goddrinksjava.attribute.Circumference;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public interface Circle extends Thing {
    default Circumference getCircumference() {
        return (Circumference) getAttribute(Circumference.class);
    }

    default void resetCircumference() {
        resetAttribute(Circumference.class);
    }
}
