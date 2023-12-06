package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem36Test {

    @Test
    public void testFindFirstTripleEvenSequence() {
        assertEquals(Arrays.asList(2, 4, 6), Problem36.findFirstTripleEvenSequence(Arrays.asList(1, 2, 4, 6, 7, 8)));
        assertEquals(Arrays.asList(), Problem36.findFirstTripleEvenSequence(Arrays.asList(1, 3, 5)));
    }
}
