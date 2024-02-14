package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem38Test {

    @Test
    public void testAverageLengthOfStringsStartingWithB() {
        assertEquals(7.5, Problem38.averageLengthOfStringsStartingWithB(Arrays.asList("banana", "blueberry", "apple")), 0.001);
        assertEquals(0.0, Problem38.averageLengthOfStringsStartingWithB(Arrays.asList("apple", "cherry")), 0.001);
    }
}
