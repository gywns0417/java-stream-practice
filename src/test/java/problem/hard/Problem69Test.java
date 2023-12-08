package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem69Test {

    @Test
    public void testCalculateAlphabeticalSymmetryScore() {
        Map<String, Integer> expected = Map.of("abc", 2, "abcd", 4, "aa", 0);
        assertEquals(expected, Problem69.calculateAlphabeticalSymmetryScore(Arrays.asList("abc", "abcd", "aa")));
    }
}
