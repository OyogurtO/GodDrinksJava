package goddrinksjava.attribute;

/**
 * @author OyogurtO
 * @since 2024/1/20
 */
public class Name implements Attribute {
    public String value;

    public Name(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
