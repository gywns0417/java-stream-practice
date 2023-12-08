package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem65Test {

    @Test
    public void testFindStringWithMostAs() {
        assertEquals("banana", Problem65.findStringWithMostAs(Arrays.asList("apple", "banana", "grape")));
    }
}
