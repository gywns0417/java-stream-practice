package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem63Test {

    @Test
    public void testCountUniqueCharacters() {
        Map<String, Long> expected = Map.of("hello", 4L, "world", 5L, "java", 3L);
        assertEquals(expected, Problem63.countUniqueCharacters(Arrays.asList("hello", "world", "java")));
    }
}
