package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem44Test {

    @Test
    public void testSumExcludingRange() {
        assertEquals(26, Problem44.sumExcludingRange(Arrays.asList(3, 5, 7, 10, 12, 15)));
    }
}
