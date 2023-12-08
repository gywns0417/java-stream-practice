package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem62Test {

    @Test
    public void testFindMaxOddNumberAbove50() {
        assertEquals(75, Problem62.findMaxOddNumberAbove50(Arrays.asList(20, 55, 75, 60, 42)));
        assertEquals(0, Problem62.findMaxOddNumberAbove50(Arrays.asList(20, 40, 60, 42)));
    }
}
