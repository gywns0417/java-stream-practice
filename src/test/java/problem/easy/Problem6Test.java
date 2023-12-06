package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem6Test {

    @Test
    public void testRemoveDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, Problem6.removeDuplicates(input));
    }
}