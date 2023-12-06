package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class Problem15Test {

    @Test
    public void testKeysForValue() {
        Map<String, String> input = Map.of("k1", "apple", "k2", "banana", "k3", "apple");
        Set<String> expected = Set.of("k1", "k3");
        assertEquals(expected, Problem15.keysForValue(input, "apple"));
    }
}