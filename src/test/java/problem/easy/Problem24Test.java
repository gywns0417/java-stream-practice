package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem24Test {

    @Test
    public void testContainsNumber() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(Problem24.containsNumber(input, 3));
        assertFalse(Problem24.containsNumber(input, 6));
    }
}
