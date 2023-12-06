package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class Problem11Test {

    @Test
    public void testFindFirstGreaterThanTen() {
        Set<Integer> input = Set.of(7, 11, 5, 3, 2);
        assertEquals(Optional.of(11), Problem11.findFirstGreaterThanTen(input));
    }
}