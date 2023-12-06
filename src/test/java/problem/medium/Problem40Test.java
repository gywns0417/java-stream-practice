package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem40Test {

    @Test
    public void testGroupStringsByLength() {
        Map<Integer, List<String>> expected = Map.of(
                5, Arrays.asList("apple", "grape"),
                6, Arrays.asList("banana", "cherry")
        );
        assertEquals(expected, Problem40.groupStringsByLength(Arrays.asList("apple", "banana", "cherry", "grape")));
    }
}
