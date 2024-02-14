package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem42Test {

    @Test
    public void testSumSpecialMultiples() {
        assertEquals(63, Problem42.sumSpecialMultiples(Arrays.asList(3, 5, 10, 15)));
    }
}
