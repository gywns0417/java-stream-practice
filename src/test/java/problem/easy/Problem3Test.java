package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem3Test {

    @Test
    public void testSumOfList() {
        List<Double> input = Arrays.asList(1.5, 2.5, 3.5);
        double expected = 7.5;
        assertEquals(expected, Problem3.sumOfList(input));
    }
}