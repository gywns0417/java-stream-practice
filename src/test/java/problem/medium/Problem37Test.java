package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem37Test {

    @Test
    public void testCountWordsContainingA() {
        assertEquals(3, Problem37.countWordsContainingA(Arrays.asList("apple", "banana", "cherry", "fig")));
    }
}
