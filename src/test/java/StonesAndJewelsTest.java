
    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.assertEquals;

    public class StonesAndJewelsTest {

        @Test
        void testStonesAndJewels() {
            StonesAndJewels solution = new StonesAndJewels();


            assertEquals(3, solution.jewelsInStones("aA", "aAAbbbb"));
            assertEquals(0, solution.jewelsInStones("z", "ZZ"));
            assertEquals(6, solution.jewelsInStones("abc", "aabbcc"));
            assertEquals(0, solution.jewelsInStones("", "abcd"));
        }
    }

