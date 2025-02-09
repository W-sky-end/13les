import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BalloonCounterTest {

    @Test
    void testMaxNumberOfBalloons() {
        BalloonCounter solution = new BalloonCounter();

        assertEquals(1, solution.maxNumberOfBalloons("nlaebolko"));
        assertEquals(2, solution.maxNumberOfBalloons("loonbalxballpoon"));
        assertEquals(0, solution.maxNumberOfBalloons("leetcode"));
        assertEquals(0, solution.maxNumberOfBalloons(""));
    }
}