package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem22Test {

    @Test
    public void testConvertToUpperCase() {
        List<String> input = Arrays.asList("java", "stream", "api");
        List<String> expected = Arrays.asList("JAVA", "STREAM", "API");
        assertEquals(expected, Problem22.convertToUpperCase(input));
    }
}
