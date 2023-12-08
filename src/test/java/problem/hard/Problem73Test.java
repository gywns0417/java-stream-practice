package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem73Test {

    @Test
    public void testCalculateNumericalConversionScore() {
        Map<String, Integer> scores = Problem73.calculateNumericalConversionScore(Arrays.asList("abc", "def"));
        assertEquals(Map.of("abc", 6, "def", 15), scores);
    }
}
