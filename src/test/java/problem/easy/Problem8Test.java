package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Problem8Test {

    @Test
    public void testFindFirstEven() {
        List<Integer> input = Arrays.asList(1, 3, 5, 6, 7);
        assertEquals(Optional.of(6), Problem8.findFirstEven(input));
    }
}