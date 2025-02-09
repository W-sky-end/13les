import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PairsTest {

    @Test
    void testPairs() {
        Pairs solution = new Pairs();

        assertEquals(4, solution.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        assertEquals(6, solution.numIdenticalPairs(new int[]{1, 1, 1, 1}));
        assertEquals(0, solution.numIdenticalPairs(new int[]{1, 2, 3}));
        assertEquals(10, solution.numIdenticalPairs(new int[]{2, 2, 2, 2, 2}));
    }
}