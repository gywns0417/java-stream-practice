package problem.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Problem35Test {

    @Test
    public void testFindLongestWord() {
        assertEquals("strawberry", Problem35.findLongestWord(Arrays.asList("apple", "banana", "strawberry")));
        assertEquals("", Problem35.findLongestWord(Arrays.asList()));
    }
}
