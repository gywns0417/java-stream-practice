package problem.extreme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import org.junit.jupiter.api.Test;

public class Problem93Test {

    @Test
    public void testCountNumbersUsingParallelStream() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        ConcurrentMap<Integer, Long> counts = Problem93.countNumbersUsingParallelStream(numbers);
        assertEquals(1, counts.get(1));
        assertEquals(2, counts.get(2));
        assertEquals(3, counts.get(3));
        assertEquals(4, counts.get(4));
    }
}
