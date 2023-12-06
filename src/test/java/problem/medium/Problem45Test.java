package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem45Test {

    @Test
    public void testConcatenateStringsOverLengthThree() {
        assertEquals("applebanana", Problem45.concatenateStringsOverLengthThree(Arrays.asList("apple", "ban", "banana")));
    }
}
