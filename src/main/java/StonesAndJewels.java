
import java.util.HashSet;
import java.util.Set;

public class StonesAndJewels {
    public int jewelsInStones(String jewels, String stones) {
        Set<Character> jewel = new HashSet<>();
        for (char j : jewels.toCharArray()) {
            jewel.add(j);
        }

        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewel.contains(c)) {
                count++;
            }
        }
        return count;
    }
}