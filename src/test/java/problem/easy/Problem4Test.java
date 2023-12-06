package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem4Test {

    @Test
    public void testFindMax() {
        List<Integer> input = Arrays.asList(3, 9, 2, 8);
        assertEquals(9, Problem4.findMax(input).getAsInt());
    }
}