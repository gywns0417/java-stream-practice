package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem80Test {

    @Test
    public void testCalculateWeightedAverageBasedOnFrequency() {
        assertEquals(2.5, Problem80.calculateWeightedAverageBasedOnFrequency(Arrays.asList(1, 2, 2, 3, 3, 3, 4)), 0.01);
    }
}
