package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem7Test {

    @Test
    public void testSortStrings() {
        List<String> input = Arrays.asList("banana", "apple", "cherry");
        List<String> expected = Arrays.asList("apple", "banana", "cherry");
        assertEquals(expected, Problem7.sortStrings(input));
    }
}