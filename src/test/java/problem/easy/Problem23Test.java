package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem23Test {

    @Test
    public void testCalculateStringLengths() {
        List<String> input = Arrays.asList("java", "stream", "api");
        List<Integer> expected = Arrays.asList(4, 6, 3);
        assertEquals(expected, Problem23.calculateStringLengths(input));
    }
}
