package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem50Test {

    @Test
    public void testFindFirstSublistWithSumOverTen() {
        assertEquals(Arrays.asList(3, 5, 4), Problem50.findFirstSublistWithSumOverTen(Arrays.asList(1, 2, 3, 5, 4)));
    }
}
