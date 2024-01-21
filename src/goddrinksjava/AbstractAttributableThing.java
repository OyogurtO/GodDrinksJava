package goddrinksjava;

import goddrinksjava.attribute.Attribute;

import java.util.HashMap;
import java.util.Map;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public abstract class AbstractAttributableThing implements Thing {
    Map<Class<? extends Attribute>, Attribute> attributeMap = new HashMap<>();

    @Override
    public Attribute getAttribute(Class<? extends Attribute> clz) {
        return attributeMap.get(clz);
    }

    public void addAttribute(Attribute attribute) {
        if (attribute != null) {
            attributeMap.put(attribute.getClass(), attribute);
            log("add attr(" + attribute.getClass().getSimpleName() + ")");
        }
    }

    @Override
    public void resetAttribute(Class<? extends Attribute> clz) {
        attributeMap.remove(clz);
        log("del attr(" + clz.getSimpleName() + ")");
    }
}
