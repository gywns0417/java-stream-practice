package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem75Test {

    @Test
    public void testCountUniqueCharacterCombinations() {
        Map<String, Long> result = Problem75.countUniqueCharacterCombinations(Arrays.asList("abc", "abb", "aaa"));
        assertEquals(Map.of("abc", 7L, "abb", 3L, "aaa", 1L), result);
    }
}
