
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSub {

    @Test
    public void testSubPositive() {
        Sub sub = new Sub();
        assertEquals(2, sub.sub(5, 3));
    }

    @Test
    public void testSubZero() {
        Sub sub = new Sub();
        assertEquals(0, sub.sub(3, 3));
    }

    @Test
    public void testSubNegative() {
        Sub sub = new Sub();
        assertEquals(-2, sub.sub(3, 5));
    }
}
