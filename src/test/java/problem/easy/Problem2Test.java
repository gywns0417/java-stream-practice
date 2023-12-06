package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem2Test {

    @Test
    public void testSquareNumbers() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 4, 9, 16);
        assertEquals(expected, Problem2.squareNumbers(input));
    }
}