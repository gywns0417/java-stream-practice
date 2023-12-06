package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem4Test {

    @Test
    public void testFindMax() {
        List<Integer> input = Arrays.asList(3, 9, 2, 8);
        assertEquals(9, Problem4.findMax(input).getAsInt());
    }
}