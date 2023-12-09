package problem.extreme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem94Test {

    @Test
    public void testCountNumbersAboveAverageInFilteredRange() {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);
        assertEquals(2, Problem94.countNumbersAboveAverageInFilteredRange(numbers)); // 25, 30
    }
}
