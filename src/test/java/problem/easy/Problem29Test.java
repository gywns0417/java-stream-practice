package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem29Test {

    @Test
    public void testTotalCharacterCount() {
        List<String> input = Arrays.asList("Java", "Stream", "API");
        assertEquals(13, Problem29.totalCharacterCount(input));
    }
}
