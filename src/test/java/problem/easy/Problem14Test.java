package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem14Test {

    @Test
    public void testFilterKeys() {
        Map<String, String> input = Map.of("key1", "value1", "k2", "value2", "key3", "value3");
        Map<String, String> expected = Map.of("key1", "value1", "key3", "value3");
        assertEquals(expected, Problem14.filterKeys(input));
    }
}
