package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

public class Problem14Test {

    @Test
    public void testFilterKeys() {
        Map<String, String> input = Map.of("key1", "value1", "k2", "value2", "key3", "value3");
        Map<String, String> expected = Map.of("key1", "value1", "key3", "value3");
        assertEquals(expected, Problem14.filterKeys(input));
    }
}
