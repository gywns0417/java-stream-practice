package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem21Test {

    @Test
    public void testConvertToStringList() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<String> expected = Arrays.asList("1", "2", "3");
        assertEquals(expected, Problem21.convertToStringList(input));
    }
}
