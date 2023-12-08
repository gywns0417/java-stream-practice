package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class Problem77Test {

    @Test
    public void testFindUniqueConsecutiveStrings() {
        List<String> result = Problem77.findUniqueConsecutiveStrings(Stream.of("a", "b", "b", "c", "a", "b"));
        assertEquals(Arrays.asList("a", "b", "c", "a", "b"), result);
    }
}
