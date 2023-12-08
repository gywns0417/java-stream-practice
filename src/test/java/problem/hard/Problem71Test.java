package problem.hard;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class Problem71Test {

    @Test
    public void testFindAllStringCombinations() {
        Set<String> combinations = Problem71.findAllStringCombinations(Arrays.asList("a", "b", "c"));
        assertTrue(combinations.containsAll(Arrays.asList("a", "b", "c", "ab", "ac", "bc", "abc")));
    }
}
