package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem39Test {

    @Test
    public void testSumOfSquaresOfNumbersGreaterThanFive() {
        assertEquals(85, Problem39.sumOfSquaresOfNumbersGreaterThanFive(Arrays.asList(1, 2, 3, 6, 7)));
    }
}
