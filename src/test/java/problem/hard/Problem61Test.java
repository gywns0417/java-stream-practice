package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem61Test {

    @Test
    public void testExtractKeyValuePairs() {
        List<String> input = Arrays.asList("apple=5", "banana=x", "cherry=12", "date=7", "invalid");
        Map<String, Integer> expected = Map.of("apple", 5, "cherry", 12, "date", 7);
        assertEquals(expected, Problem61.extractKeyValuePairs(input));
    }
}
