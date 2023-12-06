package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem21Test {

    @Test
    public void testConvertToStringList() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<String> expected = Arrays.asList("1", "2", "3");
        assertEquals(expected, Problem21.convertToStringList(input));
    }
}
