package goddrinksjava;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public interface TabbyCat extends Thing {
    default void purr() {
        log("set ACTION='purr'");
    }
}
