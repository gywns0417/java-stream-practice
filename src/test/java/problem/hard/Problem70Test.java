package problem.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem70Test {

    @Test
    public void testIdentifyPrimesAndFindMax() {
        Map<Object, Object> expected = Map.of(
                2, "Prime",
                3, "Prime",
                4, "Not Prime",
                "Max Prime", 3
        );
        assertEquals(expected, Problem70.identifyPrimesAndFindMax(Arrays.asList(2, 3, 4)));
    }
}
