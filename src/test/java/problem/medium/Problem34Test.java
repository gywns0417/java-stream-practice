package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

public class Problem34Test {

    @Test
    public void testFindMaxValue() {
        assertEquals(10, Problem34.findMaxValue(Arrays.asList(1, 2, 10, 3)));
        assertEquals(0, Problem34.findMaxValue(Collections.emptyList()));
    }
}
