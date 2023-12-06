package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem47Test {

    @Test
    public void testFindIndicesOfStringsStartingWithD() {
        assertEquals(Arrays.asList(1, 3), Problem47.findIndicesOfStringsStartingWithD(Arrays.asList("apple", "dog", "cat", "door")));
    }
}
