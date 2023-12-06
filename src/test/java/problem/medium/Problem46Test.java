package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem46Test {

    @Test
    public void testFrequencyOfNumbers() {
        Map<Integer, Long> expected = Map.of(1, 2L, 2, 1L, 3, 1L, 4, 1L);
        assertEquals(expected, Problem46.frequencyOfNumbers(Arrays.asList(1, 1, 2, 3, 4)));
    }
}
