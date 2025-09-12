import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTimes {

    @Test
    public void testTimesPositive() {
        Times times = new Times();
        assertEquals(15, times.times(5, 3));
    }

    @Test
    public void testTimesZero() {
        Times times = new Times();
        assertEquals(0, times.times(5, 0));
    }

    @Test
    public void testTimesNegative() {
        Times times = new Times();
        assertEquals(-2, times.times(3, 5));
    }
}
