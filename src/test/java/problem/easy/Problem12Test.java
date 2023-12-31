package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem12Test {

    @Test
    public void testMapStringLength() {
        Map<String, String> input = Map.of("a", "apple", "b", "banana");
        Map<String, Integer> expected = Map.of("a", 5, "b", 6);
        assertEquals(expected, Problem12.mapStringLength(input));
    }
}