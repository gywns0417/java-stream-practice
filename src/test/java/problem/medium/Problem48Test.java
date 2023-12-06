package problem.medium;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem48Test {

    @Test
    public void testIsSequentiallyIncreasing() {
        assertTrue(Problem48.isSequentiallyIncreasing(Arrays.asList(1, 2, 3, 4)));
        assertFalse(Problem48.isSequentiallyIncreasing(Arrays.asList(1, 3, 2, 4)));
    }
}
