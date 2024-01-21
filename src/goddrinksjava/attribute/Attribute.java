package goddrinksjava.attribute;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public interface Attribute {
    default Attribute toAttribute() {
        return this;
    }
}
