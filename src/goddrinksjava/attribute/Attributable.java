package goddrinksjava.attribute;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public interface Attributable {
    Attribute getAttribute(Class<? extends Attribute> clz);

    void addAttribute(Attribute attribute);

    void resetAttribute(Class<? extends Attribute> clz);
}
