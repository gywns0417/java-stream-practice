package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem41Test {

    @Test
    public void testCountAndAverageLengthOfStringsStartingWithC() {
        SimpleEntry<Long, Double> expected = new SimpleEntry<>(2L, 5.5);
        assertEquals(expected, Problem41.countAndAverageLengthOfStringsStartingWithC(Arrays.asList("cat", "car", "apple")));
    }
}
