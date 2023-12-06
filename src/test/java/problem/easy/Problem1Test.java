package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem1Test {

    @Test
    public void testFilterStrings() {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "fig");
        List<String> expected = Arrays.asList("apple", "banana", "cherry");
        assertEquals(expected, Problem1.filterStrings(input));
    }
}