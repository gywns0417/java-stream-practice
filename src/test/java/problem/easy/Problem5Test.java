package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem5Test {

    @Test
    public void testConcatenateStrings() {
        List<String> input = Arrays.asList("Java", "Stream", "API");
        String expected = "JavaStreamAPI";
        assertEquals(expected, Problem5.concatenateStrings(input));
    }
}