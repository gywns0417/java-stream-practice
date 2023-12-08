package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem67Test {

    @Test
    public void testFindLongestCommonPrefix() {
        assertEquals("fl", Problem67.findLongestCommonPrefix(Arrays.asList("flower", "flow", "flight")));
        assertEquals("", Problem67.findLongestCommonPrefix(Arrays.asList("dog", "racecar", "car")));
    }
}
