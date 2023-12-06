package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem29Test {

    @Test
    public void testTotalCharacterCount() {
        List<String> input = Arrays.asList("Java", "Stream", "API");
        assertEquals(13, Problem29.totalCharacterCount(input));
    }
}
