package problem.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem24Test {

    @Test
    public void testContainsNumber() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(Problem24.containsNumber(input, 3));
        assertFalse(Problem24.containsNumber(input, 6));
    }
}
