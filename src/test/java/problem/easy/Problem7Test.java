package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem7Test {

    @Test
    public void testSortStrings() {
        List<String> input = Arrays.asList("banana", "apple", "cherry");
        List<String> expected = Arrays.asList("apple", "banana", "cherry");
        assertEquals(expected, Problem7.sortStrings(input));
    }
}