package problem.hard;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Problem76Test {

    @Test
    public void testGroupNumbersByMultipleOfFiveAndParity() {
        Map<String, List<Integer>> groupedNumbers = Problem76.groupNumbersByMultipleOfFiveAndParity(Arrays.asList(1, 2, 5, 10, 15, 20, 25, 30));
        assertTrue(groupedNumbers.get("5의 배수-짝수").containsAll(Arrays.asList(10, 20, 30)));
        assertTrue(groupedNumbers.get("5의 배수-홀수").containsAll(Arrays.asList(5, 15, 25)));
    }
}
