package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class Problem28Test {

    @Test
    public void testFindLongestString() {
        List<String> input = Arrays.asList("Java", "Stream", "API");
        assertEquals(Optional.of("Stream"), Problem28.findLongestString(input));
        assertEquals(Optional.empty(), Problem28.findLongestString(List.of()));
    }
}
