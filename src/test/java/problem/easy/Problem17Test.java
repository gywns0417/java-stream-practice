package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

public class Problem17Test {

    @Test
    public void testCreateHashMapFromStream() {
        String[] input = {"apple", "banana", "cherry"};
        Map<String, Integer> expected = Map.of("apple", 5, "banana", 6, "cherry", 6);
        assertEquals(expected, Problem17.createHashMapFromStream(input));
    }
}
