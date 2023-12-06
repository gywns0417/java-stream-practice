package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem2Test {

    @Test
    public void testSquareNumbers() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 4, 9, 16);
        assertEquals(expected, Problem2.squareNumbers(input));
    }
}