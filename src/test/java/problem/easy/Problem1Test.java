package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem1Test {

    @Test
    public void testFilterStrings() {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "fig");
        List<String> expected = Arrays.asList("apple", "banana", "cherry");
        assertEquals(expected, Problem1.filterStrings(input));
    }
}