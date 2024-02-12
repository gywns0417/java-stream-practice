package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem31Test {

    @Test
    public void testTransformAndSortStrings() {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "fig", "elephant", "dog", "cat");
        List<String> expected = Arrays.asList("APPLE", "CHERRY");
        assertEquals(expected, Problem31.transformAndSortStrings(input));
    }
}
