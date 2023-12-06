package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;
import java.util.Set;

public class Problem15Test {

    @Test
    public void testKeysForValue() {
        Map<String, String> input = Map.of("k1", "apple", "k2", "banana", "k3", "apple");
        Set<String> expected = Set.of("k1", "k3");
        assertEquals(expected, Problem15.keysForValue(input, "apple"));
    }
}