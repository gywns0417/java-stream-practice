package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem66Test {

    @Test
    public void testCountUniqueNumbers() {
        assertEquals(4, Problem66.countUniqueNumbers(Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5)));
    }
}
