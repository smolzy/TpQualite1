import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestAdd {

    @Test
    public void testAddPositiveNumbers() {
        Add addObj = new Add();
        assertEquals(5, addObj.add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        Add addObj = new Add();
        assertEquals(-5, addObj.add(-2, -3));
    }

    @Test
    public void testAddWithZero() {
        Add addObj = new Add();
        assertEquals(7, addObj.add(0, 7));
    }
}
