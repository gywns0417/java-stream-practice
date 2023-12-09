package problem.extreme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem92Test {

    @Test
    public void testSumOfSquaresOfEvenNumbers() {
        List<List<List<Integer>>> nestedNumbers = Arrays.asList(
                Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3)),
                Arrays.asList(Arrays.asList(4, 5, 6))
        );
        assertEquals(56, Problem92.sumOfSquaresOfEvenNumbers(nestedNumbers));
    }
}
