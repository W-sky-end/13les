public class BalloonCounter {
    public int maxNumberOfBalloons(String text) {
        int[] counts = new int[26];
        for (char c : text.toCharArray()) {
            counts[c - 'a']++;
        }

        return Math.min(counts['b' - 'a'],
                Math.min(counts['a' - 'a'],
                        Math.min(counts['l' - 'a'] / 2,
                                Math.min(counts['o' - 'a'] / 2, counts['n' - 'a']))));
    }
}