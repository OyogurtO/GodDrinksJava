package goddrinksjava;

import goddrinksjava.attribute.Attributable;
import goddrinksjava.attribute.Name;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public interface Thing extends Attributable {

    default Name getName() {
        return (Name) getAttribute(Name.class);
    }

    default void log(String state) {
        Name name = getName();
        int length = name.value.length();
        int max = 5;
        int l1 = (max - length + 1) / 2 + 1;
        int l2 = (max - length) / 2 + length;
        System.out.printf("%-" + l1 + "s%-" + l2 + "s%s%s%n", "[", name, "] ", state);
    }

    default String getNameRef() {
        return "[" + getName() + "]";
    }
}
