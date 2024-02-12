package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem33Test {

    @Test
    public void testSumLengthsOfStringsStartingWithA() {
        List<String> input = Arrays.asList("apple", "banana", "avocado", "apricot", "grape");
        assertEquals(19, Problem33.sumLengthsOfStringsStartingWithA(input));
    }
}
