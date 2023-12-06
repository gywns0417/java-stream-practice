package problem.easy;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

public class Problem30Test {

    @Test
    public void testCountEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(3, Problem30.countEvenNumbers(numbers));
    }
}
