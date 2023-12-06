package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

public class Problem12Test {

    @Test
    public void testMapStringLength() {
        Map<String, String> input = Map.of("a", "apple", "b", "banana");
        Map<String, Integer> expected = Map.of("a", 5, "b", 6);
        assertEquals(expected, Problem12.mapStringLength(input));
    }
}