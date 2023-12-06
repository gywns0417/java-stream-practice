package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;
import java.util.TreeMap;

public class Problem19Test {

    @Test
    public void testCreateTreeMapFromStream() {
        String[] input = {"cherry", "banana", "apple"};
        Map<String, Integer> expected = new TreeMap<>();
        expected.put("apple", 5);
        expected.put("banana", 6);
        expected.put("cherry", 6);
        assertEquals(expected, Problem19.createTreeMapFromStream(input));
    }
}
