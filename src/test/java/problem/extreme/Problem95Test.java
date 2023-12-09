package problem.extreme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem95Test {

    @Test
    public void testGroupStringsByLengthUsingCustomCollector() {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        Map<Integer, List<String>> groupedStrings = Problem95.groupStringsByLengthUsingCustomCollector(strings);
        assertEquals(Arrays.asList("date"), groupedStrings.get(4));
        assertEquals(Arrays.asList("apple"), groupedStrings.get(5));
        assertEquals(Arrays.asList("banana", "cherry"), groupedStrings.get(6));
    }
}
