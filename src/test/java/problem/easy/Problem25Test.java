package problem.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem25Test {

    @Test
    public void testAreAllEven() {
        List<Integer> input = Arrays.asList(2, 4, 6, 8, 10);
        assertTrue(Problem25.areAllEven(input));
        assertFalse(Problem25.areAllEven(Arrays.asList(2, 3, 4)));
    }
}
