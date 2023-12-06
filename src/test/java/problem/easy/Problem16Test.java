package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import org.junit.jupiter.api.Test;

public class Problem16Test {

    @Test
    public void testCreateHashSetFromStream() {
        int[] input = {1, 2, 3, 4, 5};
        Set<Integer> expected = Set.of(1, 2, 3, 4, 5);
        assertEquals(expected, Problem16.createHashSetFromStream(input));
    }
}
