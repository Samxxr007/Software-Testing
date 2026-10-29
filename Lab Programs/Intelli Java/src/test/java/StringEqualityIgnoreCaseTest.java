
import org.junit.Test;
import static org.junit.Assert.*;

public class StringEqualityIgnoreCaseTest {

    public boolean compareStrings(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        return s1.equalsIgnoreCase(s2);
    }

    @Test
    public void testStringEqualIgnoringCase() {
        assertTrue(compareStrings("Java", "java"));
    }

    @Test
    public void testStringNotEqual() {
        assertFalse(compareStrings("Java", "Python"));
    }

    @Test
    public void testNullString() {
        assertFalse(compareStrings(null, "Java"));
    }
}
