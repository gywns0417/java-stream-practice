package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem3Test {

    @Test
    public void testSumOfList() {
        List<Double> input = Arrays.asList(1.5, 2.5, 3.5);
        double expected = 7.5;
        assertEquals(expected, Problem3.sumOfList(input));
    }
}