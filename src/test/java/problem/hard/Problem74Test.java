package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem74Test {

    @Test
    public void testFindLongestSequentiallyIncreasingSublist() {
        List<Integer> longestSublist = Problem74.findLongestSequentiallyIncreasingSublist(Arrays.asList(1, 2, 5, 3, 4, 7, 6));
        assertEquals(Arrays.asList(1, 2, 3, 4, 7), longestSublist);
    }
}
