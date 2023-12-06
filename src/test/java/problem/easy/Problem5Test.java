package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem5Test {

    @Test
    public void testConcatenateStrings() {
        List<String> input = Arrays.asList("Java", "Stream", "API");
        String expected = "JavaStreamAPI";
        assertEquals(expected, Problem5.concatenateStrings(input));
    }
}