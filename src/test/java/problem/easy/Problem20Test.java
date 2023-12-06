package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem20Test {

    @Test
    public void testCreateLinkedHashMapFromStream() {
        int[] input = {1, 2, 3};
        Map<Integer, Integer> expected = new LinkedHashMap<>();
        expected.put(1, 1);
        expected.put(2, 4);
        expected.put(3, 9);
        assertEquals(expected, Problem20.createLinkedHashMapFromStream(input));
    }
}
