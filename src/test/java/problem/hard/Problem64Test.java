package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem64Test {

    @Test
    public void testSumOfFibonacciNumbers() {
        assertEquals(19, Problem64.sumOfFibonacciNumbers(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }
}
