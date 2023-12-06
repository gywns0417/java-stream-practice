package problem.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Problem9Test {

    @Test
    public void testTransformStrings() {
        List<String> input = Arrays.asList("Java", "is", "fun");
        List<String> expected = Arrays.asList("JAVA", "is", "FUN");
        assertEquals(expected, Problem9.transformStrings(input));
    }
}