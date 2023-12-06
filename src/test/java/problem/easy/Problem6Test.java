package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem6Test {

    @Test
    public void testRemoveDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, Problem6.removeDuplicates(input));
    }
}