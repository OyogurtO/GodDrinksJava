package goddrinksjava;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public interface Sequence extends Thing {
    default Thing toLimit() {
        return this;
    }
    default void setLimit(Thing limit) {
        log("set limit=" + limit.getNameRef());
    }
}
