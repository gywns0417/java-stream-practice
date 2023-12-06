package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;

public class Problem16Test {

    @Test
    public void testCreateHashSetFromStream() {
        int[] input = {1, 2, 3, 4, 5};
        Set<Integer> expected = Set.of(1, 2, 3, 4, 5);
        assertEquals(expected, Problem16.createHashSetFromStream(input));
    }
}
