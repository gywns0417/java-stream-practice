package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem17Test {

    @Test
    public void testCreateHashMapFromStream() {
        String[] input = {"apple", "banana", "cherry"};
        Map<String, Integer> expected = Map.of("apple", 5, "banana", 6, "cherry", 6);
        assertEquals(expected, Problem17.createHashMapFromStream(input));
    }
}
