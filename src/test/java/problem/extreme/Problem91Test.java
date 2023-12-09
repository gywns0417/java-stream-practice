package problem.extreme;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class Problem91Test {

    @Test
    public void testFindFirstSublistSummingTo100() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
        Optional<List<Integer>> result = Problem91.findFirstSublistSummingTo100(numbers);
        assertTrue(result.isPresent());
        assertEquals(Arrays.asList(20, 30, 50), result.get());
    }
}
