package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem25Test {

    @Test
    public void testAreAllEven() {
        List<Integer> input = Arrays.asList(2, 4, 6, 8, 10);
        assertTrue(Problem25.areAllEven(input));
        assertFalse(Problem25.areAllEven(Arrays.asList(2, 3, 4)));
    }
}
