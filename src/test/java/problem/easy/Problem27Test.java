package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import org.junit.jupiter.api.Test;

public class Problem27Test {

    @Test
    public void testCalculateAverage() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(OptionalDouble.of(3.0), Problem27.calculateAverage(input));
        assertEquals(OptionalDouble.empty(), Problem27.calculateAverage(List.of()));
    }
}
