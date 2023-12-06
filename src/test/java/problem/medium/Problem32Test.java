package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem32Test {

    @Test
    public void testFilterAndSquareNumbers() {
        List<Integer> input = Arrays.asList(5, 10, 15, 20, 25);
        List<Integer> expected = Arrays.asList(100, 225, 400);
        assertEquals(expected, Problem32.filterAndSquareNumbers(input));
    }
}
